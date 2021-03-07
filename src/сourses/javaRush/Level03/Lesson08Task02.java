package сourses.javaRush.Level03;

import java.io.*;

/** Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/
public class Lesson08Task02 {
    public static void main(String[] args) throws IOException{
        while(true) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.println("Введите имя счастливчика");
            String name = in.readLine();
            System.out.println("Через сколько лет, ты хочешь зарабатывать");
            int age = Integer.parseInt(in.readLine());
            System.out.println("Сколько денег? В северо-американских долларах, пожалуйста");
            int many = Integer.parseInt(in.readLine());
            System.out.println("Ты будешь, через " + age + " лет, зарабатывать " + many + "... и это в валюте, заметь!");

            BufferedReader may = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader may7 = new BufferedReader(new InputStreamReader(System.in));
        }
        }
}
