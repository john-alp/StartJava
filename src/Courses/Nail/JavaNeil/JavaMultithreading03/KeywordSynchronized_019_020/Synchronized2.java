package Courses.Nail.JavaNeil.JavaMultithreading03.KeywordSynchronized_019_020;

/**
 * 12.04.2020 020 Ключевое слово synchronized II часть
 * В этом уроке сихронизировали два потока на двух разных обьектах. Получили выйгрыш в скорости, так как оба потока работуют одновременно.
 * Если же делать это на одном обьекте, то потоки работают по очереди, так как у обьекта поднят флаг в мониторе.
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchronized2 {
    public static void main(String[] args){
        new Worker().main();
   //     Worker worker = new Worker();
   //     worker.main();
    }
}
class Worker{
    Object lock = new Object();
    Object lock2 = new Object();
    Random random = new Random();
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addlist(int sleep) {
        synchronized (lock) {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(random.nextInt(100));
        }
    }
    public void addlist2(int sleep){
        synchronized (lock2){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        list2.add(random.nextInt(100));
    }

    public void work(){
        for (int i = 0; i < 1_000; i++){
            addlist(1);
            addlist2(1);
        }
    }
    public void main(){
        long before = System.currentTimeMillis();
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            work();
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            work();
        }
    });
    thread.start();
    thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Program execution time: " + (after - before) + "ms to run");
        System.out.println("List: " + list.size());
        System.out.println("List: " + list2.size());
    }
}
