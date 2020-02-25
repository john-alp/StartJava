package JavaNeil.JavaCollectionsFramework02.MetodsHashCodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** 25.02.2020    Методы hashcode и equals
 *
 *  HashMap и HashSet не допускают хранения одинаковых обьектов, в первом случае значение будет перезаписано, во втором не
 *  добавленно. Это справедливо для примитивных чисел. Но что бы это работало правильно в классах. Необходимо,в классе Person
 *  переопределить equals and hashcode, для сравнения полей класса, а не их ссылок.
 */

public class TestMetodHashCodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "John");

        map.put(person1,"123");
        map.put(person2,"123");
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
        if (this == o) return true;
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