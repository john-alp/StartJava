package сourses.javaRush.Level03;
import java.io.*;

/** 15.12.2019
 *  Как захватить мир.
 *  Ввести с клавиатуры число и имя, вывести на экран строку:«имя» захватит мир через «число» лет.
 * Му-ха-ха!Пример: Вася захватит мир через 8 лет. Му-ха-ха!
 * Последовательность вводимых данных имеет большое значение.
 */
public class Lesson08Task01 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); Эта строка расписанна ниже

        InputStream inputStream = System.in;  // System.in является объектом класса InputStream  метод read(),
                                              // который позволяет считывать данные..  System.in.read() только считывает в байтах
        Reader inputStreamReader = new InputStreamReader(inputStream); // InputStreamReader не только получает данные
                                                                       // из потока. Он еще и преобразует байтовые потоки в символьные.
        //BufferedReader+InputStreamReader работает быстрее, чем просто InputStreamReader.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Кто захватит мир? Введите имя: ");
        String name = reader.readLine(); // читаем строку с клавиатуры
        System.out.println("Через сколько лет произойдёт захват мира?: ");
        int age = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры и преобразуем её из String в int
        System.out.println("Мир, неизбежно, будет захвачен супер разумом: "+name+". Всего через "+age+" лет");
    }
}