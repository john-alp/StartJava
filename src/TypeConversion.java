/**
 * Урок 30. Преобразование типов. 07.12.2019
 *
 * В Java существует два типа преобразований - автоматическое преобразование (неявное) и приведение типов (явное преобразование).
 *
 *  Когда создаёшь вещественное число, то тип автоматически определяется doble
 *  Любое целое число является intenger
 * byte - 1 байт
 * short - 2
 * int - 4
 * long - 8
 *
 * float - 4
 * double - 8
 * char - 2
 * boolean - 0,1
 *
 */
public class TypeConversion {
    public static void main(String[] args){
        byte x = 1;
        int y;
        float z = 12.4F;  // указать, что тип Float (F)
        long l = 1234567890L; // указать, что тип Long(L)
        // long в int
        int h = (int)l;  // явное
        System.out.println(h);

        double d = 123.4;
        float f = (float)d;
        System.out.println(f);

        int t = 123;
        double j = t;
        System.out.println(j);

        double a = 190.5;
        int q = (int)a;
        System.out.println(q);


        long v = Math.round(a);
        System.out.printf("%d",v);
    }
}
