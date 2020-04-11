package JavaNeil.JavaMultithreading03;

/**
 * 10.04.2020
 * 017 Введение в многопоточность в Java
 */

public class Introduction {
    public static void main (String[] args) throws InterruptedException {
/*
 *  Реализует первый метод создания многопоточности
 */
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        /*
         * Запускает выполнение потока myThread  и сразу переходит к выполненинию следующих инструкций
         * В джаве потоки не синхронизированы и они "борятся" за процессорное время
         *
         */
        myThread.start();
        System.out.println("Я выполнюсь быстрее, чем в потоке myThread");
        myThread2.start();
        Thread.sleep(1000);
        /*
         *  Для реализации второго метода. Создаем обьект класс Thread (java.lang) и в него передаем наш класс Runner
         */
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}
/*
 * Один из методов создания многопоточности. Создаём свой класс и наследуемся от класс Thread. Что мы запустим в этом классе,
 * будет работать в этом потоке
 * Переопределяем метод run.
 *  Указываем в этом методе код который хотим выполнить. Чтобы выполнить run, нужно, как не странно выполнить start().
 *  Он переопределён в классе Thread
 */
class MyThread extends Thread {
    /**
     * Именно здесь описываем код, который необходимо выполнить в этом потоке
     */
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("Я работаю в потоке myThread " + i);
        }
    }
}
/*
 *  Второй метод для реализации многопоточности. По идее равнозначный с вышеуказанным. Но выглядит чище
 */
class Runner implements Runnable { // в этом интерфейсе существует только оддин метод run, который мы и переопределяем
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("Я работаю в потоке Runner " + i);
        }
    }
}

