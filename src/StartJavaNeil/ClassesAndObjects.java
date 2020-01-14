// Класс пишется с большой буквы
// Класс это чертёж, а обьект это сделанная по этому чертежу деталь. Обьект, штука материальная, а класс не материальная...
// У класса могут быть:
//                      1. Данные (поля)
//                      2. Действия (методы)
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person john = new Person();
        john.name = "Евгений"; // плохо то, что обращаемся напрямую к полям класса Person (ур.18 Инкапсуляция)
        john.age = 41;
        john.speak();
        int years2 = john.calculateAge(); // Запускаю метод calculateAge и принимаю в переменную years2 значение, которое вернул метод
        System.out.println("До пенсии мне осталось - " + years2 + " Года. Низкий поклон Владимир Владимировичу...");
        System.out.println();

        Person tatiana = new Person();
        String s1 = "Татьяна";
        tatiana.setNameAndAge(s1, 37);   // если метод ждёт значния(агумента), то они обязательно должны быть (tatiana.setName() - вызовет ошибку)
        tatiana.age = 37;
        int yearsTanya = tatiana.calculateAge();
        System.out.println("До пенсии мне осталось - " + yearsTanya + " Года.");

        Person daria = new Person();
    }
}

class Person {
    String name;
    int age;

    // void speak(здесь - параметры метода){здесь - тело метода};
    void speak() {   // метод speak, не возрвщающий ни какие значения (void - не возращать)
        System.out.println("Здравствуйте, я метод Speak и я вывожу заранее присвоенные значения - " + "Имя: " + name + " Возраст: " + age);
        System.out.println();
    }

    int calculateAge() { // метод возвращающий int значение, находящиеся в переменной years
        int years = 65 - age;
        return years;   // возврат переменной в место откуда вызван метод и мгновенный выход из метода
    }

    void setNameAndAge(String username, int userage) {  // метод ждёт строку и цифры, создаст переменную username и useage
        name = username;  // перезначаем переменную name, которая находится в поле класса Person  (17 урок)
        age = userage;    // тоже самое
        System.out.printf("Меня зовут %s и мне %d%n", name, age);
    }
}
