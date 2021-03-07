package сourses.javaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 06.01.2020
 *  День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

public class Lesson04Task06 {
    public static void main(String[] args) throws IOException {
        while (true){
        System.out.println("Please, input digit day week");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int digit = Integer.parseInt(reader.readLine());
        week(Integer.parseInt(reader.readLine()));
        }
    }
    private static void week(int day){
         String[] array = {"Monday","Tuesday","Webnesday","Thursday","Friday","Saturday","Sunday"};
         if((day > 0) && (day < 8)) System.out.println(array[day-1]);
         else System.out.println("There is no such day of the week!");
    }
}
