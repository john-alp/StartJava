package JavaRush.Level02;
/**12.12.2019
* Минимум трех чисел
* Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Lesson08Task03 {
    public static void main(String[] args) {
        int a = 50, b = 9, c = -300;
        System.out.println("Наименьшее число: " + min(a, b, c));
    }

    private static int min(int a, int b, int c){
        int result = 0;         //// Объяснение : Сначала сравниваем первые два числа и среди них находим найменьшее.
                                //// Потом найменьшее среди первых двух сравниваем с последним третим числом.
     if(a<b){
         result = a;
     }else{result=b;
     }if(result<c){
         return result;
        }else {return c;}


        /*  //// С Таней сочиняли, прикольно))
        if (a < b) {
            if(a<c) {result=a;
                return result;}
            else {result=c;
            return result;}
        }
        else {
            if (b < c){
                result = b;
            return result;}
            else {result=c;
            return result;}
        }

         */
    }

}

