package Inheritance;

// Dog тоже animal, она может есть, и она может спать. В данном случае собака более узкое понятие, чем животное
public class Dog extends Animal {
    public void bark(){              // создал свой метод в классе Dod
        System.out.printf("Animal %s%n","гавкает");
    }
    public void eat(){               // переопределяю метод eat из класса Animal
        System.out.printf("Dusya %s%n%s","кушать изволит",name);
    }
}
