public class WhileTest {
    public static void main(String[] ars){
        int a = 0;
        int b = 3;
        System.out.println("Работает цикл while, " + a + " меньше " + b);
        while (a < b){       // Kак и все операторы, пишется с маленькой буквы
                             // Работает, пока значение true
            System.out.println(a + " Меньше " + b);
            a +=1;
        }
    }
}
