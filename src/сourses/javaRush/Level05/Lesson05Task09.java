package сourses.javaRush.Level05;

/** 17.02.2020
 *
 * Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол

 */
public class Lesson05Task09 {
    public static void main(String[] args) {

    }
}

class
Friend{
    int age;
    String name, sex;

    public Friend (String name){
       // name.repeat(8);
        while (name.isEmpty())
        this.name = name;
    }
    public Friend (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend (String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
