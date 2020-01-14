package Calculate;
import java.util.Scanner;

/**
 *  Первый супер проект - калькулятор. Начало 08.12.2019
 */
public class Works {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Calculate xz = new Calculate();
        int plus=1;
        int a = scan.nextInt();
        int c = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("a "+a);
        System.out.println("c "+c);
        System.out.println("b "+b);
        if(plus == c){
            System.out.println("Net menya..");
            //int result = xz.slozhenie(a, b);
            //System.out.println(result);
        }

        System.out.println(c+" Ne ravno "+plus);
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