package сourses.nailAlishev.JavaNeil.JavaMultithreading03.KeywordSynchronized_019_020;
/*
В многопоточном программировании ввели специальное понятие мьютекс
 (от англ. «mutex», «mutual exclusion» — «взаимное исключение»).
Задача мьютекса — обеспечить такой механизм, чтобы доступ к объекту в определенное время был
только у одного потока. Если Поток-1 захватил мьютекс объекта А, остальные потоки не получат к нему доступ,
чтобы что-то в нем менять. До тех пор, пока мьютекс объекта А не освободится, остальные потоки будут
вынуждены ждать.
 */
public class Synchronized1 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Synchronized1 synchronized1 = new Synchronized1();
        synchronized1.doWork();
// только одному потоку разрешенно выполнять тело метода
        // для синхронизации нужен обьект (исп.поле monitor)
        //не указываем обьект явно, то мы используем обьект this (Здесь Synchronized1)

    }
    public synchronized void increment(){
        counter++; // Операция не атомарная counter = counter + 1  (3. считывание переменной counter, прибавление 1, запись переменной)
    }

    /*
    public void increment() {
        synchronized (this) {  // эта конструкция называется синхронайз блок и эквивалентна public synchronized void increment
            counter++;
        }
    }
    */

    public void doWork() throws InterruptedException {
        while (true) {
            counter = 0;
            Thread.sleep(100);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100_000_000; i++) {
                        increment();
                    }
                }
               // Что находится в теле метода  только один поток получает доступ в один момент времени
            });
            Thread.sleep(100);
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increment();
                    }
                }
            });

            thread.start();
            thread2.start();
            thread.join();
            thread2.join();

            System.out.println(counter);

        }
    }
}