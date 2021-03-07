package сourses.javaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 14.01.2020
 *   Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/
public class Lesson07Task04 {
    public static void main(String[] args) throws IOException {
while (true){
    System.out.println();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите три числа.. Положительные и отрицательные. (Тсс.. Будет магия!)");
        digit (Integer.parseInt(bf.readLine()),Integer.parseInt(bf.readLine()),Integer.parseInt(bf.readLine()));
    }
    }
    private static void digit (int a, int b, int c){
        int minus = 0, plus = 0;
        if (a < 0) minus = 1;
        else plus = 1;
        if (b < 0) minus++;
        else plus++;
        if (c < 0) minus++;
        else plus++;
        System.out.println("Kоличество отрицательных чисел: "+minus);
        System.out.println("количество положительных чисел: "+plus);
    }
}
/*
int d = 0;
        if (a > 0)
            d++;
        if (b > 0)
            d++;
        if (c > 0)
            d++;
        System.out.println(d);
 */