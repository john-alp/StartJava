package Courses.JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 06.01.2020
 Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/
public class Lesson04Task07 {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Input yers");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            dayYers(Integer.parseInt(reader.readLine()));
        }
    }
    private static void dayYers(int result){
        int v = 366;
        int nv = 365;
        if (result <= 400){
            if (result % 4 == 0) System.out.println("Год високосный "+v+" дней.");
            else System.out.println("Год не високосный "+nv+" дней.");
        }
        else if (result % 400 == 0){
            System.out.println("Год високосный "+v+" дней.");
        }
        else System.out.println("Год не високосный "+nv+" дней.");
//        System.out.println("May "+(result % 100));
//        if ((result%4==0) | (result%100==0) & (result%400==0)){
//            System.out.println("Год високосный");
//        }
//        else System.out.println("Год не високосный");
    }
}
