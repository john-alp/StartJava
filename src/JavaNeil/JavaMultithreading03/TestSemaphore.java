package JavaNeil.JavaMultithreading03;

import java.util.concurrent.Semaphore;

/**
 * 14.04.2020  027 Семафор Semaphore
 *
 * Семафоры представляют еще одно средство синхронизации для доступа к ресурсу. В Java семафоры представлены классом
 * Semaphore, который располагается в пакете java.util.concurrent.
 *
 * Для управления доступом к ресурсу семафор использует счетчик, представляющий количество разрешений.
 * Если значение счетчика больше нуля, то поток получает доступ к ресурсу, при этом счетчик уменьшается на единицу.
 * После окончания работы с ресурсом поток освобождает семафор, и счетчик увеличивается на единицу.
 * Если же счетчик равен нулю, то поток блокируется и ждет, пока не получит разрешение от семафора.
 */

public class TestSemaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        semaphore.acquire();
        System.out.println("Осталось разрешений: " + semaphore.availablePermits());
        semaphore.release();
        System.out.println("Осталось разрешений: " + semaphore.availablePermits());

    }
}
