package JavaRush.Level04;
/** 20.01.2020
 *  Рисуем прямоугольник
Ввести два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class Lesson13Task02 {
    public static void main(String[] args) {
        solution(5, 30);
    }
    // m - string, n - columns
    private static void solution(int m, int n){
        for (int i=0 ; i < m ; i++){
            System.out.print("8");
        for (int j = 0; j < n - 1; j++){
            System.out.print("8");
        }
            System.out.println();
        }

    }
}
