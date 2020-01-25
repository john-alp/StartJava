package JavaRush.Level04;

import java.lang.reflect.Array;
import java.util.Arrays;

/** 20.01.2020
 * Среднее такое среднее
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 Т.е. не самое большое и не самое маленькое.*/
public class Lesson16Home02 {
    public static void main(String[] args) {
        solution(5000,-4,3000);
    }
    private static void solution(int a, int b, int c){
        int [] array = new int [3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}

