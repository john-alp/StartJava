public class If {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        if(a>b){               // Выполняется, пока в скобках true, иначе выполняется else
            System.out.println("Я первый \"if\" и утверждаю, что " + a + " больше, чем " + b);
        }
        else if(a<b){
            System.out.println("Я \"else if\" и утрверждаю, что " + a + " меньше, чем " + b);
        }
        else{
            System.out.println("Я второй \"else\" и утверждаю, что " + a + " равно " + b);
        }

    }
}


/*
 else{
         System.out.println("Я \"else\" и утрверждаю, что " + a + " меньше, чем " + b);
*/
