package JavaRush.Level03;
/** 14.12.2019
 * Таблица умножения.
 * Выведи на экран таблицу умножения 10 на 10 в следующем виде:1 2 3 …2 4 6 …3 6 9 ……
 */


public class Lesson06Task02 {
    public static void main(String[] args) {
        int x=1, y=1;
        while(x<=10){
            x++;
            while (y<=10){
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
    }
}
