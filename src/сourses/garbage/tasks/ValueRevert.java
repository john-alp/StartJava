package сourses.garbage.tasks;

import java.util.Arrays;

/**
 * 1) Напишите программу на Java для переворота последовательности символов в строке
 * без использования встроенной в String функции reverse()
 * 2)Напишите программу на Java для того, чтобы поменять местами значения,
 * хранящиеся в двух переменных с помощью третьей переменной
 * 3)Напишите программу на Java, чтобы поменять местами значения,
 * хранящиеся в двух переменных, без использования третьей переменной
 */

public class ValueRevert {
    static String value = " One";
    static String value2 = " Two";
    static int digit = 1;
    static int digit2 = 2;
    static String temp = null;

    // 2
    public static String task2() {
        temp = value;
        value = value2;
        value2 = temp;
        return (value + value2);
    }
    // 3
    public static String task3String() {
        value += value2;
        value2 = value.substring(4);
        value = value.substring(0, 4);
        return value + value2;
    }

    public static int[] task3Int() {
        digit += digit2;
        digit2 = digit - digit2;
        digit -= digit2;
        int[] temp = {digit, digit2};
        return temp;
    }

    public static void main(String[] args) {
        System.out.printf("%s " + value + value2 +"\n", "origin:");
        System.out.print("task 2: " + task2() + "\n");
        System.out.printf("task 3 string: %s\n", task3String());

        //    System.out.print(Array.getInt(task3Int(),0));
        //    System.out.println(Array.getInt(task3Int(),1));

        System.out.print("Task 3 Int: ");
        Arrays.stream(task3Int()).forEach(System.out::print);
    }
}
