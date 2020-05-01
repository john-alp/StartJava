package Courses.Nail.StartJavaNeil.NestedСlass;
/** 14.12.2019
 *  Урок 43  Вложенные классы
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();

    }
}
