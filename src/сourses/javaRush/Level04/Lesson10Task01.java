package сourses.javaRush.Level04;
/** 18.01.2020
 *  10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
   10 чисел наоборот
 Вывести на экран числа от 10 до 1 используя цикл while.
 */

public class Lesson10Task01 {
public static void main(String[] args){
    int i=0;
    while (i <= 9){
        i++;
        System.out.println(i);
        System.out.println();
    }
    int j = 10;
    while (j > 0){
        System.out.println(j);
        j--;
    }
}
}
/*
 int a =1;
        while (a < 11)
        {
            System.out.println(a);
            a++;
        }
 */
