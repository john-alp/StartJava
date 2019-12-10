package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

/**
 *  Урок 37 Исключения
 *  Нужно указывать Джаве, на то, что если не получится загрузить или найти файл, например "test2"
 *  Все исключения наследуются от класса Exceptions
 *  если создать метод, где нужно исключение, то из места откуда вызывается метод, тоже нужно описывать исключения.
 */
public class Test {
    public static void main(String[] args){ //throws FileNotFoundException { - в случае отсутствия файла выбрасываем FileNotFoundException
        //// 1 я часть
        File file = new File("test2");
        try {
            Scanner scaner = new Scanner(file); // нужно обработать сценарий если файла "test2" нет в переменной file
            System.out.println("Файл найден и загружен");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.printf("File not %s%n","найден!");
        }
        System.out.println("Выполняюсь дальше");

        //// 2я часть
        try {
            May.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Тревога!! В классе Test2 не загрузился файл!!!!");;
        }
    }
}

class May {
    public static void readFile() throws FileNotFoundException { // несмотря на наличие этого исключения, исключения
        // нужно описывать и там, где будет вызван этот метод!! См. 2часть, там решил обработать try и catch
        File file2 = new File("test2");
        Scanner scanner2 = new Scanner(file2);
        System.out.println("Привет из класса Test2");
    }
}