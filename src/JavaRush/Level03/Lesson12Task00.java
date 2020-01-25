package JavaRush.Level03;

public class Lesson12Task00 {
    public static void main(String[] args) {
//    solution(111);
        System.out.println(sumDigitsInNumber(546));
        }

        public static int sumDigitsInNumber(int number) {
            String s = ""+number; /*преобразуем число в строку*/
            char a[]=s.toCharArray();  /*разбиваем строку на отдельные символы типа char каждый из которых засовываем в массив a[ ] -> a[0]="5", a[1]=4; a[2]=6;*/
            int ret=0; /*объявляем переменную возврата и даем ей значение 0*/
            int len=a.length; /*вычисляем длину массива (количество рязрядов в нашем числе) и загоняем его в новую переменную len*/
            for (int i=0; i<len; i++) { /*запускаем цикл количество оборотов которого равно длине массива данный цикл должен по очереди перебрать каждую ячейку массива а*/
                int t=(int)a[i]-48; /*преобразуем символ числа типа char содержащегося в каждой из ячеек массива в число типа int и загоняем его значение в переменную t*/
                ret=ret+t; /*увеличиваем переменную возврата на t*/
            }
            return ret; /*завершаем работу метода возвращая финальное значение t*/
        }
    }

    //    static void solution(int num){
//      int sum = 0;
//      do{
//       sum = sum+num%10;
//       num = num/10;
//      }
//      while (num!=0);
//        System.out.println(sum);
//
//    }


/*
static int method4(int num){
        int sum=0;
        do  {
            sum+=num%10;
            num/=10;
        } while (num!=0);
        return sum;
    }
 */

