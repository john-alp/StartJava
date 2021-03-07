package ReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  Продолжение урока 36 Чтение из файла   10.12.2019
 *
 *  пробуем считать столбцы... На самом деле не столбцы, а одна строка с тремя символами через пробел
 *  1 2 3
 */
public class ReadingFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        // создаем обьект типа файл(нам нужно переместить файл в обьект)
        String separator = File.separator;
        String targetFile = "test.txt";
        String path = "C:" + separator + "Users"+separator+"Professional"+separator+"IdeaProjects"+separator+"StartJava"+separator+"src"+separator
                +"ReadingFile"+separator+targetFile;
        File file = new File(path); // File встроенный обьект(io.File)

        //Scanner scanner = new Scanner(System.in);  //java.leng - class System - in - константа, в которой находится стандартный поток ввода
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); // знаем, что одна строка. Считываем её, в line лежит "1 2 3", теперь нужно всё получить по отдельности
        String [] numbers = line.split(" "); // встроенный метод, которуму нужно указать, чем разделять

        System.out.println(Arrays.toString(numbers)); // Arrays.toString - простейшем способе печати массива в виде строки
        scanner.close();

    }
}
