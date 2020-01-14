package JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 12.01.2020
 *  Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/
public class Lesson06Task02  {
public static void main(String[]args)throws IOException{
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        solution(a,b,c,d);
        }
        private static void solution (int a, int b, int c, int d){
        if((a > b) && (a > c) && (a > d)) System.out.println(a);
        else if((b > a) && (b > c) && (b > d)) System.out.println(b);
        else if((c > a) && (c > b) && (c > d)) System.out.println(c);
        else System.out.println(d);
        }

}

/*
int e;
        if (a > b)
            e =a;
        else
            e =b;
        if (e             e =c;
        if (e < d)
            e = d;
        System.out.println(e);

Объяснение : вводим временную переменную. Сравниваем первые два числа и этой переменной присваиваем найбольшее.
Дальше сравниваем эту переменную с остальными двумя числами.

 int e;
        if (a < b) e = a;
        else e = b;
        if (e < c) System.out.println("Little digit "+e);
        else System.out.println("Littel digit"+c);

 */
