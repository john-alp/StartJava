package Courses.JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 12.01.2020
 *  Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/
public class Lesson06Task04 {
    public static void main(String[] args) throws IOException {
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            String name = reader.readLine();
            String name1 = reader.readLine();
            solution(name, name1);
        }
    }
    private static void solution(String name, String name1){
        if(name.equals(name1)) System.out.println("Name equals!");
        else if (name.length() == name1.length()) System.out.println("Name not equals! "+"Length equals");
        else System.out.println("Name and length not a equals");
    }
}

/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else
        {
            if (name1.length()==name2.length())
                System.out.println("Длины имен равны");
 */