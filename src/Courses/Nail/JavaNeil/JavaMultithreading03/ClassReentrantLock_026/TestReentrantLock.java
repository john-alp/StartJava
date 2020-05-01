package Courses.Nail.JavaNeil.JavaMultithreading03.ClassReentrantLock_026;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 14.04.2020  026 Класс ReentrantLock         https://metanit.com/java/tutorial/8.9.php
 *
 * Вначале поток пытается получить доступ к общему ресурсу. Если он свободен, то на него накладывает блокировку.
 * После завершения работы блокировка с общего ресурса снимается. Если же ресурс не свободен и на него уже наложена
 * блокировка, то поток ожидает, пока эта блокировка не будет снята.
 *
 * Классы блокировок реализуют интерфейс Lock, который определяет следующие методы:
 * void lock(): ожидает, пока не будет получена блокировка
 *
 * void lockInterruptibly() throws InterruptedException: ожидает, пока не будет получена блокировка, если поток не прерван
 *
 * boolean tryLock(): пытается получить блокировку, если блокировка получена, то возвращает true. Если блокировка
 * не получена, то возвращает false. В отличие от метода lock() не ожидает получения блокировки, если она недоступна
 *
 * void unlock(): снимает блокировку
 *
 * Condition newCondition(): возвращает объект Condition, который связан с текущей блокировкой
 *
 * Организация блокировки в общем случае довольно проста: для получения блокировки вызывается метод lock(),
 * а после окончания работы с общими ресурсами вызывается метод unlock(), который снимает блокировку.
 *
 * Объект Condition позволяет управлять блокировкой.
 *
 * Как правило, для работы с блокировками используется класс ReentrantLock из пакета java.util.concurrent.locks.
 * Данный класс реализует интерфейс Lock.
 */
public class TestReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
         @Override
         public void run() {
             task.firsThread();
         }
     });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
         task.showCounter();
    }
}

class Task{
    private int counter;
private Lock lock = new ReentrantLock();
    private void increment(){
        for (int j = 0; j < 1000_000_000; j++){
            counter++;
        }
    }
    public void firsThread(){
        lock.lock();
        increment();
        lock.unlock();
    }
    public void secondThread(){
        lock.lock();
        increment();
        lock.unlock();
    }
    public void showCounter(){
        System.out.println(counter);
    }
}

