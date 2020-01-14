package EqualsStringPool;

/**
 * урок 42  Метод equals() и String Pool.
 *
 * equals - сравнение обьектов
 * String Pool - это пул всех строк в джаве
 *  String a = "Hello";  один обьект, две ссылки...
 *  String b = "Hello";
 *  String a = new String("Hello");  два разных обьекта, две ссылки
 *  String b = new String("Hello");
 */
public class Test {
    public static void main(String[] args) {
    Animal animal1 = new Animal(1);
    Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));  // сравниваем два обьекта с помощью переопределённого метода equals
                                                        // сравниваем поля id
    }
}

class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){    // переопределяем метод equals.. Object obj потому, что так наз. в классе Object
    Animal otherAnimal = (Animal)obj;     // downcasting c Objekt до Animal...  / Данной строкой мы переопределяем тип данных из Object в Animal
    return this.id == otherAnimal.id;
    }
}
