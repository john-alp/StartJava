package сourses.javaRush.Level02;
import java.lang.System;
import java.util.Scanner;

/** 12.12.2019
 *  - Минимум двух чисел
 * Написать функцию, которая возвращает минимум из двух чисел.
 *
 *
 */
public class Lesson08Task01 {
    public static void main(String[] args) {
        System.out.println("Совершенная и неповторимая программа, которая умеет вычислять наименьшее число.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число..");
        int a=scanner.nextInt();
        System.out.println("Введите второе число..");
        int b=scanner.nextInt();

        int result = returnMin(a,b);
        System.out.println(new StringBuilder().append("Наименьшее число: ").append(result).toString());
        System.out.println("Спасибо за внимание!");
    }
    public static int returnMin(int a, int b){
        int result = 0;
        if(a<b) result = a;
        else result = b;
        return result;

        /*
        int result=0;
        if(a<b){
            result = a;
            return result;
        }else{
            result = b;
            return result;
         */
        }

    }

