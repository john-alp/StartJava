package сourses.nailAlishev.StartJavaNeil;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи свой возвраст - 9, 37 или 41");
        int age = scan.nextInt();
        switch (age) {
            case 9:
                System.out.println("Ты Даша Брусника!");
                break;
            case 37:
                System.out.println("Ты Татьяна - несмеяна!");
                break;
            case 41:
                System.out.println("Ты счастливый человек, который решил стать мегапрограммистом!!");
                break;
            default:
                System.out.println("Какой-то незнакомый возраст, ты кто, мил человек?!");
        }
    }

}