public class Break_Continue {
    public static void main(String[] args){
        /**
         * Break
         */
        System.out.println("Рассматриваем работу \"Break\"");
        int i = 0;
        while(true){
            System.out.println("Мы в цикле while, переменная i равна "+i);
            i++;
            if(i==3) {
                break;
            }
        }
        System.out.println("Мы вышли из цикла");
        System.out.println();
        /**
         * Continue
         */
        System.out.println("Рассматриваем работу \"Continue\"");
        for(int w=0; w<=10; w++){
            if(w%2==0){                    //  %2 Остаток после деления на 2, если остаток 0, то срабатывает continue
               // System.out.println("Чётные числа");
               // System.out.println(w);
                continue;
            }
            System.out.println("Нечётные числа"+w);
        }
    }

}
