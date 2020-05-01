package Courses.Nail.JavaNeil.JavaMultithreading03.ProducerConsumerPattern_022_024;

/*
java.util.concurrent  Параллельные коллекции облегчают разработку многопоточных программ,
 предоставляя потокобезопасные, удачно сделанные структуры данных
Пакет java.util.concurrent включает классы для формирования блокирующих очередей с поддержкой многопоточности.
 Блокирующие очереди используются в тех случаях,
когда нужно выполнить (проверить выполненение) какие-либо условия для продолжения потоками своей работы.
 */
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    private volatile static int count = 0;
    Object lock = new Object();
    public static void main (String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
    }
    private static void produce() throws InterruptedException {
        Random random = new Random();
        synchronized (new Object()){
        while(true){
            queue.put(random.nextInt(10));
        }
        }
    }
    private static void consumer() throws InterruptedException {
        synchronized (new Object()){
        while (true){
           Thread.sleep(50);
            int temp = queue.take();
            if (temp == 5){
                count++;
                System.out.println("May " + temp + " count: " + count);


            }
            System.out.print(queue.take() + " ");
        }
        }
    }
}
