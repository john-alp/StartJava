package Courses.JavaRush.Level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  15.12.2019
 *  Я буду зарабатывать $50 в часВвести с клавиатуры число n.Вывести на экран надпись
 * «Я буду зарабатывать $n в час».
 * Пример:Я буду зарабатывать $50 в час
*
* */
public class Lesson12Home3 {
    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько ты собираешся зарабатывать в час?");
        int result = Integer.parseInt(n.readLine());
        System.out.println("«Я буду зарабатывать "+ result +" в час»");
    }
}
