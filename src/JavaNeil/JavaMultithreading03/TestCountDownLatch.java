package JavaNeil.JavaMultithreading03;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 14.04.2020   025 Класс CountDownLatch  (защелка назад :) )
 * колличество итераций которые нужно выполнить, чтобы защёлка открылась
 *
 * поток исполнения находился в режиме ожидания до тех пор, пока не наступит одно (или больше) событие.
 *
 * Для ожидания по самоблокировке в потоке исполнения вызывается метод await()
 *
 * Чтобы известить о событии, следует вызвать метод countDown(). Ниже при­ведена общая форма этого метода.
 * Всякий раз, когда вызывается метод countDown(), отсчет, связанный с вызывающим объектом, уменьшается на единицу.
 */

public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
    CountDownLatch countDownLatch = new CountDownLatch(3);
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 3; i++){
    executorService.submit(new Processor(countDownLatch));
      }
    executorService.shutdown();
    /*
    .await - ждем, пока пройдем все уровни, которые задали в CountDownLatch
     */
    countDownLatch.await();
        System.out.println("Защелка открылась и главный поток (main) продолжил работу. ");
    }
}

class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    public Processor(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}
