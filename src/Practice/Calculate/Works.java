package Practice.Calculate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Первый супер проект - калькулятор. Начало 08.12.2019
 */
public class Works {
    public static void main(String[] args) throws IOException {
        for (;true;){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Calculate start = new Calculate();
        double digitA = Double.parseDouble(bf.readLine());
        String signC = bf.readLine();
        double digitB = Double.parseDouble(bf.readLine());

        start.setDigits(digitA, signC, digitB);
        System.out.println(start.getResult());
            System.out.println();

        }
      }
    }

class Calculate{
    private final String PLUS = "+";
    private final String MINUS = "-";
    private final String MULTIPLY = "*";
    private final String DIVIDE = "/";
    private double digitA, digitB, result;
    private String signC;

    // Создаём сеттер
    public void setDigits(double digitA, String signC, double digitB) {
        this.digitA = digitA;
        this.digitB = digitB;
        this.signC = signC;
        equals1();
    }
    // Создаем геттер
    public double getResult() {
        return result;
    }
    // Какую операцию совершаем? + - * /
     private void equals1 () {
//         System.out.println("a "+digitA);
//         System.out.println("c "+signC);
//         System.out.println("b "+digitB);

         if (PLUS.equals(signC)) result = digitA + digitB;
         if (MINUS.equals(signC)) result = digitA - digitB;
         if (MULTIPLY.equals(signC)) result = digitA * digitB;
         if (DIVIDE.equals(signC)) result = digitA / digitB;
     }



}