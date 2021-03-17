package сourses.patterns;

/**
 * Фабричный метод — это порождающий паттерн проектирования,
 * который определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять
 * тип создаваемых объектов.
 *
 * Паттерн Фабричный метод предлагает создавать объекты не напрямую, используя оператор new,
 * а через вызов особого фабричного метода. Не пугайтесь, объекты всё равно будут создаваться при помощи new,
 * но делать это будет фабричный метод.
 *
 *
 */

public class Factory {
    public static void main(String[] args) {
        SuperFactory superFactory = new SuperFactory();
        Car kawasaki = superFactory.create("Kawasaki");
        Car mazda = superFactory.create("Mazda");
        kawasaki.drive();
        mazda.drive();
    }
}

interface Car {
    void drive();
}


class Kawasaki implements Car {
    @Override
    public void drive() {
        System.out.println("It's motobike");
    }
}

class Mazda implements Car {
    @Override
    public void drive() {
        System.out.println("It's Mazda");
    }
}

class SuperFactory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Kawasaki":
                return new Kawasaki();
            case "Mazda":
                return new Mazda();
            default:
                return null;
        }
    }
}