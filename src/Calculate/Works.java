package Calculate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *  Первый супер проект - калькулятор. Начало 08.12.2019
 */
public class Works {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Calculate xz = new Calculate();
        int plus=+;
        int aDigit = Integer.parseInt(bf.readLine());
        String cSign = bf.readLine();
        int bDigit = Integer.parseInt(bf.readLine());
        System.out.println("a "+aDigit);
        System.out.println("c "+cSign);
        System.out.println("b "+bDigit);
        if(plus == cSign){
            System.out.println("Net menya..");
            //int result = xz.slozhenie(a, b);
            //System.out.println(result);
        }
        
        // if(name.equals(name1)) System.out.println("Name equals!");
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