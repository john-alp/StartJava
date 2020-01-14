package JavaRush.Level04;

import javax.annotation.processing.AbstractProcessor;
import java.security.cert.CRL;

/**   15.12.2019
 *  Реализовать метод addPrice
Реализовать метод addPrice(int applesPrice), чтобы при его вызове суммарная стоимость яблок увеличивалось на переданное значение.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.

 в статических методах к переменной класса обращаются с помощью имени класса, в нашем случае через Apple
*/
public class Lesson01Task01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice+ Apple.may);
        System.out.println((char)27 + "[31mКРАСНЫЙ");
    }



    public static class Apple{

        public static int applesPrice = 0;
               static String may = "    Я статическая переменная обьявленная в другом классе видна здесь!";

               public static void addPrice(int applesPrice){ // метод
            Apple.applesPrice = Apple.applesPrice + applesPrice;
        }
    }
}
