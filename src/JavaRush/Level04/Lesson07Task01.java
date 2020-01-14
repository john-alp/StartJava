package JavaRush.Level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 14.01.2020
 *  Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/
public class Lesson07Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        integerDigit(Integer.parseInt(buf.readLine()));
    }
    private static void integerDigit(int digit){
    if (digit == 0) System.out.println("null");
    else if (digit % 2 == 0){
            if (digit < 0 ) System.out.println("Oтрицательное четное число");
            else System.out.println("Положительное четное число");
        }
        else if (digit < 0) System.out.println("Oтрицательное нечетное число");
        else System.out.println("Положительное нечетное число");

    }
}
