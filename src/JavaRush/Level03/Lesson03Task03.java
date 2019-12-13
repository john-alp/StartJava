package JavaRush.Level03;
/** 13.12.2019
 *  Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/
public class Lesson03Task03 {
    public static void main(String[] args) {
        System.out.println(1*2*3*4*5*6*7*8*9*10);
    for(int i=0;i<10;i++){
        int result = i*i;
        System.out.println(result);
    }
    }
}
