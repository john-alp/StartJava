package сourses.javaRush.Level03;

import java.util.Scanner;

/** 14.12.2019
 * Конвертер времени
 * Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
 * Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/
public class Lesson05Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество часов: ");
        System.out.println(convertToSeconds(scanner.nextInt()));
    }
    public static int convertToSeconds(int hour){
        return hour*60*60;
    }
}
