
package сourses.nailAlishev.StartJavaNeil.Inheritance; // наследование, класс Dog наследует поля и методы класса Animal

/**
 *  06.12.2019   Урок 25 Наследование
 *
 *  Обратите внимание: перед методом, который мы переопределяем, пишем "@Override".
 *  Это дает понять компилятору, что мы хотим переопределить метод.
 */
public class Works {
    public static void main (String[] args){
      Animal animal = new Animal(); // абстрактный, так как мы не знаем какое это животное, собака, кошка ..
        animal.eat();
        animal.sleep();
        Dog dusya = new Dog();  // более конкретный, класс Dog наследует поля и методы класса Animal
        dusya.eat();   // метод из класса Animal     // поэтому, я могу сейчас вызвать методы из класса Animal (eat, sleep) обращаясь к обьекту класса Dog (dusya)
        dusya.sleep(); // метод из класса Animal
        dusya.bark(); // вызываю метод из класса Dog // уникальный метод, так как только собака умееет гавкать
    }
}
