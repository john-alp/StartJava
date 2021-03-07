package сourses.nailAlishev.StartJavaNeil.ReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Урок 36  Чтение из  файла
 *  считываем строки
 *  may
 *  may2
 *  may3
 *
 */
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        // создаем обьект типа файл(нам нужно переместить файл в обьект)
        String separator = File.separator;
        String targetFile = "may.txt";
        String path = "C:" + separator + "Users"+separator+"Professional"+separator+"IdeaProjects"+separator+"StartJava"+separator+"src"+separator
                +"ReadingFile"+separator+targetFile;
        File file = new File(path); // File встроенный обьект(io.File)

        //Scanner scanner = new Scanner(System.in);  //java.leng - class System - in - константа, в которой находится стандартный поток ввода
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {  // цикл будет выполняться до тех пор пока есть строки. Возращает тру если есть ещё строки
            System.out.println(scanner.nextLine());
        }
    scanner.close();
    }

}
