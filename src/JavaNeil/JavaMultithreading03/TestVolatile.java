package JavaNeil.JavaMultithreading03;

import java.util.Scanner;

/**
 * 11.04.2020  018 Ключевое слово volatile
 *   Ключевое слово volatile указывается для поля для того, чтобы указать компилятору,
 *   что все операции присвоения этой переменной и все операции чтения из неё должны быть атомарными.
 *
 */
public class TestVolatile {
    public static void main (String[] args){
    MyThread2 myThread2 = new MyThread2();
        Scanner scanner = new Scanner(System.in);
    myThread2.start();
    scanner.nextLine();
   // Прерываем выполнение программы изменением переменной
    myThread2.shutdown();
    }
}
/*
 * volatile — это один из способов обеспечения согласованного доступа к переменной разными потоками.
 *
 *  - Гарантирует, что переменная run не кэшируется в памяти ядра процессора, тоесть эту переменную можно модернизировать
 */
class MyThread2 extends Thread {
    private volatile boolean run = true;
    public void run () {
        while (run) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("May ");
        }

    }
    public void shutdown(){
     this.run = false;
    }
}
