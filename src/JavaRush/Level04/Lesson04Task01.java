package JavaRush.Level04;

/** 27.12.2019
 *
 * Меньше 5 - и
 * Реализовать метод compare(int a).
 * Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 - и,
 * выводить строку "Число больше 5", если параметр метода больше 5 - и выводить строку "Число равно 5", если параметр метода равен 5 - и.
*/

public class Lesson04Task01 {
   public static void main(String[] args){
       compare(3);
       compare(8);
       compare(5);

   }
    private static void compare (int digit){
       if(digit < 5) System.out.println("Число "+digit+" меньше 5");
       if(digit > 5) System.out.println("Число "+digit+" больше 5");
       if(digit == 5) System.out.println("Digit "+digit+" equally 5");

    }
}
