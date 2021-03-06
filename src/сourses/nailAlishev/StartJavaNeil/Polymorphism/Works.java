package сourses.nailAlishev.StartJavaNeil.Polymorphism;


/**
 *  Полиформизм. Урок Полиформизм. 07.12.2019
 *  Многообразие форм. В IT способность метода обрабатываь данные разных типов
 */
public class Works {
    public static void main(String[] args){
        // Третья часть урока
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);   // дог @Override
        test(cat);  // у кэта нет своего метода, потому выводим родительский

        /*  //// Вторая часть урока
        Animal animal = new Dog();  // слева переменная animal класса Animal = cправа обьект класса Dog
                                    // если убрать extends с класса Dog к классу Animal, то возникнет ошибка
        // можем обращаться к обьекту класса Dog  через переменную родительского типа Animal
        // здесь рассматриваем собаку как животное, поэтому имеем доступ только к методам класса Animal
        Dog dog = new Dog(); // здесь рассматриваем собаку как и животное, и как собаку. Поэтому имеем доступ к методам и Animal, Dog

        animal.eat(); // будет вызван метод, переопределённый в потомке(то есть, будет вызван @Override метод из класса Dog)
                      // Это называется --> поздним связыванием <--
        // если @Override нет, то будет вызван родительский метод
        */
        /* ////первая часть урока
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();          // метод eat, есть только потому, что класс Dog extends класса Animal
        */
    }
    // продолжение третьей части
    public static void test (Animal kuskus){ // можем передавать в метод разные типы, если у них один и тот же родитель
        kuskus.eat();
    }


}
