package сourses.javaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/** 18.01.2020
 *  Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/
public class Lesson10Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String string = bf.readLine();
        int digit = Integer.parseInt(bf.readLine());
        while (0 < digit){
            System.out.println(string);
            digit--;
        }
    }
}
