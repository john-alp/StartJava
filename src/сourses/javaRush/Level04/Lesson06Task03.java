package сourses.javaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 12.01.2020
 *  Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
public class Lesson06Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(c) demiurg & Tatiana ");
        System.out.println("Hello, my frind! Please input three digit..");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        solution (a,b,c);
    }
    private static void solution (int a, int b, int c){
        int e;
        int max;
        int medium=0;
        int min;
    if(a > b) e = a;
    else e = b;
    if(e > c) max = e;
    else max = c;

    if(a < b) e = a;
    else e = b;
    if(e < c) min = e;
    else min = c;

    if ((a < max) & (a > min)) medium = a;
    else if ((b < max) & (b > min)) medium = b;
    else medium = c;


        System.out.println(max+" "+medium+" "+min);
    }
}
/*
        Integer[] array = new Integer[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0; i         {
            System.out.println(array[i]);
        }


    }
}

Объяснение : лучше всего решать с помощью массивов и метода sort.
В курсе иногда дают задания на опережение. Collections.reverseOrder() дает возможность сортировать по убыванию.
 */