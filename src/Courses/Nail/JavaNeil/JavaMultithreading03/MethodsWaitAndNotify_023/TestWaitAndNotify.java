package Courses.Nail.JavaNeil.JavaMultithreading03.MethodsWaitAndNotify_023;

import java.util.Scanner;

/**
 * 13.04.2020   023 Методы wait и notify
 * wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор,
 * пока другой поток не вызовет метод notify()
 *
 * notify(): продолжает работу потока, у которого ранее был вызван метод wait()
 *
 * notifyAll(): возобновляет работу всех потоков, у которых ранее был вызван метод wait()
 */
/*
    wait - вызывается в пределах синхронизуемого блока и на обьекте на котором синхронизирован блок
     */
public class TestWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thred = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thred.start();
        thread2.start();
        thred.join();
        thread2.join();

    }

}


class WaitAndNotify{
    public void producer() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");
            wait(); // 1-отдаем intrinsic lock, 2 - ждём, пока будет вызван notify() на этом же обьекте
            /*
            Вообще необходимо выполнения двух условий - Освобождения монитора(intrinsic lock) и вызов на этом же обьекте
            notify()
             */
            System.out.println("Produser thread resumed...");
        }
    }
    public void consumer() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Press any key...");
            scanner.nextLine();
            notify();
            Thread.sleep(5000);
        }
    }

}