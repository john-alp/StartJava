package сourses.javaRush.Level04;
/** 18.01.2020
 *  Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
public class Lesson13Task01 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
           if (i%2 == 0) System.out.print(i+" ");

        }
    }
}
