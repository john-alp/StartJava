package Courses.JavaRush.Level04;
/** 18.01.2020
 *  Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/


public class Lesson10Task05 {
    public static void main(String[] args) {
    int a = 1;
    int b = 1;
        while (a < 11)
    {
        while (b < 11)
        {
            System.out.print(a * b + " ");
            b++;
        }
        a++;
        b = 1;
        System.out.println();
    }
  }
}
