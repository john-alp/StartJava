package Courses.JavaRush.Level03;
/** Реализация метода     13.12.2019
Реализуйте метод public static void writeToConsole(String s), который добавляет к началу строки выражение "printing: "
и выводит измененную строку на экран, каждый раз с новой строки.
Пример вывода для "Hello world!":
printing: Hello world!
*/
public class Lesson05Task02 {
    public static void main(String[] args){
        writeToConsole("Hello world!");
    }
    private static void writeToConsole(String s){
        System.out.printf("printing: %s%n",s);
    }
}
