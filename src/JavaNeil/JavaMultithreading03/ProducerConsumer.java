package JavaNeil.JavaMultithreading03;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    private volatile static int count = 0;
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
        while(true){
            queue.put(random.nextInt(30));
        }
    }
    private static void consumer() throws InterruptedException {
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
