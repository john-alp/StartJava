package Transformations;

/**
 *  Урок 32 Восходящие и нисходящие преобразования 
 *
 *  Если в результате присваивания мы двигаемся по цепочке наследования вверх (к типу Object),
 *  то это — расширение типа (оно же — восходящее преобразование или upcasting),
 *  а если вниз, к типу объекта, то это — сужение типа (оно же — нисходящее преобразование или downcasting).
 */

public class Works {
    public static void main(String[] args){
        Animal animal = new Dog(); // это upcasting-восходящее преобразование... декларируем переменную класса Animal, а создаём обьект класса Dog

        Dog dog = new Dog();
        Animal animal2 = dog; // неявно, джава делает всё сама
        animal2.eat();

       Object may2 = Animal();

        // downcasting - нисходящее преобразование

    }

}
