package сourses.nailAlishev.JavaNeil.JavaMultithreading03.ProducerConsumerPattern_022_024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 *  14.04.2020  Producer - Consumer смоими руками ))
 */

public class ProducerConsumer2 {

    public static void main(String[] args) throws InterruptedException {
        ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerAndConsumer.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerAndConsumer.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}
class ProducerAndConsumer {
   CountDownLatch countDownLatch = new CountDownLatch(3);
    private Queue<Integer> queue = new LinkedList<>(); // Обычная очередь - не потокобезопасна
    final Random random = new Random();
    Object lock = new Object();

    public void producer() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 10) {
                    lock.wait();
                }
                queue.offer(random.nextInt(100));
                lock.notify();
            }
        }
    }

    public void consumer() throws InterruptedException {
        int counter = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0){
                    /*
                     освобождает монитор (intrinsic lock) и ЖДЕМ когда на ЭТОМ же обьекте бутет
                     будет вызван notify()
                     */
                    lock.wait();
                }
                int result = queue.poll();
               // System.out.print(result + " ");
                if (result == 5){
                    counter++;
                    System.out.println(" May : " + counter);
                }
                /*
                необходимо выполнения двух условий - Освобождения монитора(intrinsic lock) и
                вызов на этом же обьекте notify()
                 */
                lock.notify();
            }
            Thread.sleep(100);
        }
    }
}