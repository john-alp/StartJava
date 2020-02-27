package Arseniev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 25.02.2020
 *
 */

public class Calculate {
    //public static void main(String[] may) throws IOException, InterruptedException {
    public static void main(String[] args) throws InterruptedException {
        double first = 0;
        double second = 0;
        String exit = "no";
        String symbol = null;
        Operation operation = new Operation();
        System.out.println("Calculate...  (c)demiurg  v 2.0");
        while (!exit.equals("yes")){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first argument.. ");
        try {
                first = Double.parseDouble(reader.readLine());
            } catch (Exception e) {
                System.out.println("Error... may bee..    "+e);
                continue;
            }
        System.out.println("Enter a calculation operation..             (Help:  - + * / ^)");
            try {
                symbol = reader.readLine();
            } catch (IOException e) {

            }
            System.out.println("enter the second argument... ");
            try {
                second = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println("I'm thinking... ");
        Thread.sleep(900);
        System.out.println("Сontemplating the result :                  "+operation.ArgsAndSym(first, second, symbol));
        Thread.sleep(1000);
        System.out.println("The End");
            Thread.sleep(6000);
            System.out.println();
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Exit is the calculation?                          (Help: yes/no)");
            try {
                exit = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 5; ++i) System.out.println();

        }
    }
}
class Operation{
    private double summ;
    public double ArgsAndSym(double first, double second, String symbol) {

        switch (symbol.trim()) {
            case "-":
                summ = first - second;
                break;
            case "+":
                summ = first + second;
                break;
            case "*":
                summ = first * second;
                break;
            case "/":
                if (second == 0){
                    System.out.println("You can't divide by zero!");
                    break;
        }else{
                    summ = first / second;
            }
                break;
            case "^" : summ = Math.pow(first, second);
            default: summ = 0;
                System.out.println("The mathematical symbol is not recognized: "+symbol);

        }
        return summ;
    }

    @Override
    public String toString() {
        return "Result " + summ;
    }
}

