package Courses.Nail.JavaNeil.JavaMultithreading03.ClassCountDownLatch_025;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch2 {
    public static void main (String[] args) throws InterruptedException {
        final int THREADS = 2;
        CountDownLatch countDownLatch = new CountDownLatch(THREADS);
        ExecutorService executorService = Executors.newFixedThreadPool(THREADS);
        for (int i = 0; i < THREADS; i++){
            executorService.submit(new Process(i,countDownLatch));
        }
        executorService.shutdown();
        for (int k = 0; k < THREADS; k++){
            Thread.sleep(1000);
            executorService.shutdown();
        }
    }
}
class Process implements Runnable{
    private int id;
    public CountDownLatch countDownLatch;
    public Process(int id, CountDownLatch countDownLatch){
        this.id = id;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceeded");
    }
}
