package JavaNeil.JavaCollectionsFramework02.MetodsHashCodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** 25.02.2020   Урок 009 и 010  Методы hashcode и equals
 *  009
 *  HashMap и HashSet не допускают хранения одинаковых обьектов, в первом случае значение будет перезаписано, во втором не
 *  добавленно. Это справедливо для примитивных чисел. Но что бы это работало правильно в классах. Необходимо,в классе Person
 *  переопределить equals and hashcode, для сравнения полей класса, а не их ссылок. Так как наследуем от обьжекта
 *
 *  010
 *  наиболее быстрый метод это хэшкод. Не всегда работает правильно, колличество хэшКодов ограниченно, могут возникать коллизии
 * наиболее точный это йкволс
 *
 * Контракт hashcode() equals()
 *
 *      У двух проверяемых обьектов вызываем метод hashcode()
 *    если хэшкоды разные, то и обьекты гарантированно разные. И это очень быстро.
 *    если одинаковые, то обьекты одинаковые, но это не точно) Дополнительно проверяем методом equals
 */

public class TestMetodHashCodeAndEquals {
    public static void main(String[] args) {
        // Создаем хэшМап
        Map<Person, String> map = new HashMap<>();
        // Слздаем хэшСет
        Set<Person> set = new HashSet<>();
        // Создаем два обьекта
        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "John");
        // Добавляем обьекты и примитивы в хэшМап
        map.put(person1,"123");
        map.put(person2,"123");
        // Добавляем обьекты в хэшСет
        set.add(person1);
        set.add(person2);

        System.out.println("It is metod map "+map);
        System.out.println("It is metod set "+set);

    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    // переопределяем toString
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}