package Exceptions;

/**
 * Урок 39 11.12.2019   Checked и Unchecked исключения
 * В джаве исключения делятся на две большие группы
 * Checked - возникают во время компиляции. (Compile time exception) = исключительные случаи в работе программы
 * Unchecked - во время выполнения программы (runtime exception) = это ошибка, её не нужно обрабатывать, её нужно исправлять
 *
 * Все классы Exception типа Checked, кроме одного RuntimeException
 * Objekt - Trowable- Exception - ....
 */
public class Test3 {
    public static void main(String[] args) {
        // int x = 1/0;  //самая распространённая ошибка, компилятор её не видит. А вылезет она в момент выполнения программы
        //String str=null;
        //str.length();     // пытаемся вызвать строковый метод на пустоте - будет NullPointerException
        int[] arr = new int [2];
        System.out.println(arr[2]); //выход за рамки массива (доступны 0,1) - ArrayIndexOutOfBoundsException
    }
}
