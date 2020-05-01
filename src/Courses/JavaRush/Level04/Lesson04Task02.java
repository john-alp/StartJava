package Courses.JavaRush.Level04;
/** 27.12.2019
 *  Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/
public class Lesson04Task02 {
    public static void main(String[] args) {
        closeToTen(2, 13);
        //closeToTen(14, 7);
    }
        public static void closeToTen(int a, int b) {
            //::CODE:
            int n = abs(a-10);  // 10 число к которуму подбираем ближайшие числа
            int m = abs(b-10);  // Из введённых чисел, вычитаем 10 и результат записываем  в переменные n и m
            System.out.println("Result digit a: "+n);
            System.out.println("Result digit b: "+m);

            if (n < m)
                System.out.println(a);
            else if (abs(a-10) > abs(b -10))
                System.out.println(b);
            else
                System.out.println(b);

        }


    public static int abs(int a) {
        if (a < 0) {
            return -a;  // ??
        } else {
            return a;
        }
    }
}