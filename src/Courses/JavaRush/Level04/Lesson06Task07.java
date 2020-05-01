package Courses.JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 14.01.2020
 *  Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/
public class Lesson06Task07 {
    public static void main(String[] args) throws IOException {
        int i = 0;
        while (i++ < 4){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digitOne = Integer.parseInt(reader.readLine());
        int digitTwo = Integer.parseInt(reader.readLine());
        int digitThree = Integer.parseInt(reader.readLine());
        threeDigit(digitOne,digitTwo,digitThree);
    }
    }
    private static void threeDigit(int one, int two, int three){
        if (one == two) System.out.println("3");
        else if (two == three) System.out.println("1");
        else if (one == three) System.out.println("2");
    }
}
/*
//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a==b)
            System.out.println(3);
        else
        {
            if (a==c)
                System.out.println(2);
            else
                System.out.println(1);
        }
 */