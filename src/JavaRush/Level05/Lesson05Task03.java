package JavaRush.Level05;

/** 27.01.2020
 * Геттеры и сеттеры для класса Dog. Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создайте геттеры и сеттеры для всех переменных класса Dog.
 */
public class Lesson05Task03 {
}

class Dog {
    //
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name = this.name;
    }

    public int getAge() {
        return age;
    }
}

