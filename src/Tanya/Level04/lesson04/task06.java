package Tanya.Level04.lesson04;

import java.util.Scanner;

/** 06.01.2020
*День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/
public class task06 {
    public static void main(String[] args) {
        while (true){
        System.out.println("Введите номер дня недели.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
            }
        }
    }
}
/*Решение с масивом
public class Program {
public static void main(String[] args) throws Exception {
String[] array = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int a = Integer.parseInt(reader.readLine());
if(a > 0 && a < 8)
System.out.println(array[a-1]);
else
System.out.println("Такого дня не существует");
}
}*/
