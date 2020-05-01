package Courses.JavaRush.Level04;
/** 20.01.2020
 *  Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/
public class Lesson13Task04 {
    public static void main(String[] args) {
        for (int i = 1; i<10 ; i++){
            System.out.print("8 ");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("8");
        }
    }
}
