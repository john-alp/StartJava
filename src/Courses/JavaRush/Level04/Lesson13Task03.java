package Courses.JavaRush.Level04;
/** 20.01.2020
 *  Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Lesson13Task03 {
    public static void main (String[] args){
        for (int i = 1; i < 11; i++ ){
            for (int j = i; 0 < j ; j--){
                System.out.print("0");
            }
            System.out.println();
        }

        }
    }
    /*
//напишите тут ваш код
        for (int i=10; i > 0; i--)
                {
                for (int a = i; a < 11; a++)
        {
        System.out.print(8);
        }
        System.out.println("");
*/