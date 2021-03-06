package сourses.nailAlishev.StartJavaNeil.Transformations;

/**
 *  Урок 32 Восходящие и нисходящие преобразования
 *
 *  Если в результате присваивания мы двигаемся по цепочке наследования вверх (к типу Object),
 *  то это — расширение типа (оно же — восходящее преобразование или upcasting),
 *  а если вниз, к типу объекта, то это — сужение типа (оно же — нисходящее преобразование или downcasting).
 */

public class Works {
    public static void main(String[] args){
        // это upcasting-восходящее преобразование... декларируем переменную класса Animal, а создаём обьект класса Dog
        Animal animal = new Dog(); // можно так
        System.out.println();
        Dog dog = new Dog();   // а можно вот так. Тоесть, с начала создаём переменную класса Dog, а потом присваеваем её к классу Animal
                               //
        Animal animal2 = dog; // это и есть апкастинг,  неявно, джава делает всё сама - обьект Dog, поднялся наверх к Animalu и стал животным
        animal.eat();          // доступны методы только из Animala, так как собака, стала животным и переопредёлённые методы из Dog

       //Object may2 = Animal();

        // downcasting - нисходящее преобразование. Идём от родителя вниз к

        Dog dog2 = (Dog)animal; // даункастинг. Явный, нужно указать
        dog2.bark();

        // Опасно, внизу моделирование ошибки
        Animal animal3 = new Animal();
        Dog dog3 = (Dog)animal2;
        dog3.bark();


    }

}
