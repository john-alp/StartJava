package Calculate;

import java.util.Scanner;

/**
 *  Первый супер проект - калькулятор. Начало 08.12.2019
 */
public class Works {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculate xz = new Calculate();
        String  plus = "+";
        int a = scan.nextInt();
        String c = scan.next();
        int b = scan.nextInt();
        System.out.println("a "+a);
        System.out.println("c "+c);
        System.out.println("b "+b);
        System.out.println("plus "+plus);
        if(plus == plus){

            int result = xz.slozhenie(a, b);
            System.out.println(result);
        }


    }
}
class Calculate{
    int a;
    int b;

    public int slozhenie(int a, int b){
       int result = a + b;
        //System.out.println(result);
       return result;
    }
    public int vichitanie(){
        int result2 = a - b;
        return result2;
    }
}