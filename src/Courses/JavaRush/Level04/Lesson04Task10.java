package Courses.JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 12.01.2020
 *  Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/
public class Lesson04Task10 {
public static void main(String[] args) throws IOException {
  while (true){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input digital A : ");
    int a = Integer.parseInt(reader.readLine());
    System.out.println("Input digital B : ");
    int b = Integer.parseInt(reader.readLine());
    System.out.println("Input digital C : ");
    int c = Integer.parseInt(reader.readLine());
    solution(a,b,c);
}
}
 private static void solution (int a, int b, int c){
    if((a == b) && (b == c) && (c == a)) System.out.println("Equals A = B = C   "+a+" "+b+" "+c);
    else if(a == b) System.out.println("Equals A = B   "+a+" "+b);
    else if(b == c) System.out.println("Equals B = C   "+b+" "+c);
    else if(a == c) System.out.println("Equals C = A   "+a+" "+c);

 }
}

/*  From Courses.JavaRush
 if (a==b)
        {
            if (a==c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + b);
        }
        else
        {
            if (a==c)
                System.out.print(a + " " + c);
            if (b==c)
                System.out.print(b + " " + c);
        }
    }
}

Объяснение : Сравниваем первые два числа, если они равны то сравниваем любое из них с третьим. Если они не равны то сравниваем оба с третьим.
 */
