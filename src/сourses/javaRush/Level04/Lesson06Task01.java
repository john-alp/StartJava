package сourses.javaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 12.01.2020
 *  Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/
public class Lesson06Task01 {
    public static void main(String[] args) throws IOException {
        while (true){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
        System.out.println("Input digit: ");
        int a = Integer.parseInt(reader.readLine());
            System.out.println("Input digit: ");
        int b = Integer.parseInt(reader.readLine());
        solution(a,b);
    }
    }
    private static void solution (int a, int b){
        if(a < b) System.out.println("Minimal "+a);
        else System.out.println("Minimal "+b);
    }
}

