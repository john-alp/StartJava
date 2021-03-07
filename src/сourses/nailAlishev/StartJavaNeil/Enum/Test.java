package сourses.nailAlishev.StartJavaNeil.Enum;

/** 04.01.2020
 *  Урок 48 Enum (перечисление)
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.KROKO;
        System.out.println(animal.getTranslation());  // запрашиваю через геттер
        System.out.println(animal);
        switch (animal){
        case DOG:
            System.out.println("It is a Dog");
            break;
        case CAT:
            System.out.println("It is a CAT");
            break;
        default:
            System.out.println("It is an Animal");

    }
        System.out.println(animal instanceof Animal);
    }

}
