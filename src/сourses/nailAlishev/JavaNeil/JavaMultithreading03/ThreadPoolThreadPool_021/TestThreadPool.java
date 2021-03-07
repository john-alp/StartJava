package сourses.nailAlishev.JavaNeil.JavaMultithreading03.ThreadPoolThreadPool_021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *  12.04.2020  021 Пул потоков Thread pool
 */

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
    /*
    ExecutorService исполняет асинхронный код в одном или нескольких потоках.
    Например, если надо создать пул с 2мя потоками, то делается это так:
    */
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 8; i++){
            executorService.submit(new Work(i));
        }
        /*
        shutdown - больше не ждём задания
         */
        executorService.shutdown();
        System.out.println("All tasks submitted ");
        /*
        executorService.awaitTerminator - сколько ждать выполнения всез заданий
         */
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
class Work implements Runnable{
    private int id;
    public Work(int id){
        this.id  = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sir, construction completed! " + "cases: " + id);
    }
}
