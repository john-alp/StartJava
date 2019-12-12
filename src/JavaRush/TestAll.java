package JavaRush;


import java.util.Date;
public class TestAll {
    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова");
    }
}

class Jarvis {
    public void sayHi(String... names) {
        for (String name : names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }
}



