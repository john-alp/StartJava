package Courses.JavaRush.Level04;

import java.util.Scanner;

/** 05.01.2020
 *  Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/
public class Lesson04Task05 {
    public static void main(String[] args) {
        while (true){
         Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число, для криптоанализа!");
                                                                   //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int digit = scanner.nextInt();
        if(digit >= 0) System.out.println("Положительное число, увеличенное в два раза "+digit * 2);
        else System.out.println("Число отрицательное, прибавляем единицу "+(digit +1));
            System.out.println();
        }
    }
}
