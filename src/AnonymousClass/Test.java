package AnonymousClass;

/**
 * Урок 35. Аноннимные классы.
 * автор рекомендует пересмотреть урок по интерфейсам
 *
 *
 */
class Animal{
    public void eat(){
        System.out.printf("I am Animal %s%s%n","и я кушаю","!");
    }
}

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();
        Animal animal2 = new Animal(){   // ставим фигурные скобки, в конце точку с запятой и получаем анонимный класс,
                                         // унаследованный от Animal, где переопределяем метод eat
                                         // здесь переопределяем только один метод
            public void eat(){
                System.out.printf("Блять, сказал же - жрать хочу!!%n");
            }
        };
        animal2.eat();
        ////
        AbleToEat ableToEat = new AbleToEat(){ // Мы не можем создавать обьекты интерфейса. Создаётся анонимный класс, который наследует или реализует
                                               // методы ableToEat и в котором мы можем переопределить мно методов
                                               // создаем только на один раз!
            @Override
            public void eat() {                 // переопределяем метод
                System.out.printf("Ладно, не хочу - я сытый%n");
            }
        };
        ableToEat.eat();
    }
}

interface AbleToEat{
    public void eat();
}