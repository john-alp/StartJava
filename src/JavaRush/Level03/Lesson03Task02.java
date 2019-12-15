package JavaRush.Level03;

import java.util.Scanner;

/** Конвертер валют
Реализуйте метод convertEurToUsd, переводящий рубли в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: рубль = доллар * курс
*/
public class Lesson03Task02 {
    public static void main(String[] args) {
        while (true){
        int defaultCourse = 64;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара.");
        double courseDollar = scan.nextDouble();
        System.out.println("Введите сумму в рублях");
        double summ = scan.nextDouble();

        convertEurToUsd(courseDollar,summ);
            System.out.println();
            System.out.println();
    }
    }
    private static void convertEurToUsd(double course, double summa){
        System.out.println("За "+summa+" рублей, можно выручить "+summa/course+" северо-американских долларов.");
    }
}

