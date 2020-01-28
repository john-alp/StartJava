package JavaRush.Level02;

/** 12.12.2019
 *  Максимум двух чисел
 * Написать функцию, которая вычисляет максимум из двух чисел.
 *
 *
 * */

public class Lesson08Task02 {
    public static void main(String[] args) {
        int a=-30, b=30;
        System.out.println("Введёные числа: а "+a+" b "+b);
        System.out.println("Максимальное число: "+returnMax(a,b));
    }
    private static int returnMax(int a, int b){
        int result = 0;
        if (a < b) result = b;
        else result = a;
        return result;
    }
 }
/*
 Если а меньше b, то запускаем цикл, в котором, в переменную result загружаем значение цисла b. return
 Если а больше b или равно, то выполняем инструкцию else - в переменную result загружаем переменную a. return

 */