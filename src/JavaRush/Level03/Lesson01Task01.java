package JavaRush.Level03;
/**
*Реализация метода 13.12.2019
 * Реализуйте метод public static void div(int a, int b).
 * Метод должен делить первое число на второе,
 * и выводить на экран результат деления а / b.
 */
public class Lesson01Task01 {
    public static void main(String[] args) {
        div(40,2);
        div(2,2);
    }
    private static void div(int a, int b){
        int c = a/b;
        System.out.println("Результат: "+ c);
    }
}
