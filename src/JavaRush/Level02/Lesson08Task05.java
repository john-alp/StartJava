package JavaRush.Level02;

/** Дублирование строки. 12.12.2019
 * Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
 */
public class Lesson08Task05 {
    public static void main(String[] args) {
        // String text = new String("Какой-то текст, который нужно вывести три раза");
        String text = "Какой-то текст, который нужно вывести три раза";
        function(text);   // потому, что метод static
    }
    public static void function (String text){   // метод принадлежит классу, а не обьекту
                                        // А обычные, нестатические методы, можно вызывать только на конкретных объектах, которые мы создали.
        System.out.printf("%s%n",text);
        System.out.println(text);
        System.out.println(text);
    }
}
