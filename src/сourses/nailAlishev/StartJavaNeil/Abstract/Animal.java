package сourses.nailAlishev.StartJavaNeil.Abstract;

/**
 *  Класс не самостоятельный, от него обязательно нужно наследоваться и обязательно реализовать АБСТРАКТНЫЕ методы
 *
 *  Мы будем все есть одинаково, но издавать разные звуки
 */

public abstract class Animal { // даем понять джаве, что это не конкретный класс, что не нужно создавать обьекты
    // Его можно наследовать, дополнять и после этого создавать какие-то сущности
        public void eat(){
            System.out.printf("I am eating%s%n"," ");
        }
        public abstract void makeSound2();
    }

