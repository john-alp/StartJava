package StartJavaNeil;//import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Урок 33 Дженерики (параметизация)
 */
public class Djneriky {
    public static void main(String[] args){
        //// Так было в java 5
        List animals = new ArrayList();  // ArrayList - динамически изменяемый массив
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mouse");
        Krokodilen kroko = new Krokodilen(); // Здесь, кстати, можно любой тип обьекта. Сейчас создам класс Krokodilen и попробую засунуть в массив
        animals.add(kroko);
         String getAnimal = (String)animals.get(2); // Обьекты класса Object будем воспринемать как обьекты класса String. Типа здесь downcasting
                                                       // идём сверху в низ. С обьекта Object ..
                                                        // downcasting, ещё потому, что обьекты могут быть разного типа
        System.out.printf("%s%n",getAnimal);

        //// С появлением дженериков
        // List <> при создании обьекта, в таких скобках указываем тот тип, тот класс обьекты которого будут помещаться в ArrayList
        // даём знать Джаве, что в этом ArrayList будут храниться только обьекты класса String
        List<String> animals2 = new ArrayList<String>(); // так как String, можем добавить только строковые обьекты
        animals2.add("Cat2");
        animals2.add("Dog2");
        animals2.add("Enot");
        System.out.println(animals2.get(2));

        //// С 7 Java, можно так..
        List<String> animal3 = new ArrayList<>(); // Cправа не указываем в угловых скобках тим данных - и так всё понятно


    }
}
class Krokodilen{

        }
