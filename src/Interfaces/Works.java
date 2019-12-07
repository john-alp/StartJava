package Interfaces;

/**
 * Урок 26 Интерфейсы. 06.12.2019
 */
public class Works {
    public static void main(String[] args){
        Info cat = new Animal(1);   // Эти классы реализуют интерфейс Info.. поэтому, возможно так делать.. тип инфо ссылается на обьект класса энимал
        Info man = new Person("Evgeny");
        cat.showInfo();   // доступ только к методам, которые есть в интерфейсе Info
        man.showInfo();
        System.out.printf("--------------------------%s%n","Дичь какая-то");
        outputInfo(cat);
        outputInfo(man);
    }
    public static void outputInfo(Info info){  // вместо String написали название интерфейса Info и
        // ввиде аргумента передаем обьект (Animal-cat и Person-man)
        info.showInfo();
    }
}
/*Animal animal1 = new Animal(1);
        Person person1 = new Person("Evgeny");
        animal1.sleep();
        person1.sayHello();
        System.out.printf("--------------------------%s%n","-");
        animal1.showInfo();
        person1.showInfo();*/