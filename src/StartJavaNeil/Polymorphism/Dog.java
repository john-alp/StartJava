package Polymorphism;

public class Dog extends Animal {
    public void bark(){
        System.out.printf("%s%n","Хочу и гавкаю");
    }
    @Override
    public void eat(){
        System.out.printf("%s%n","Сорри, я собака и я ем"); // Позднее связывание
    }
}
