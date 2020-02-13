package JavaNeil.JavaCollectionsFramework02;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** 12.02.2020
 *  002 Динамический массив ArrayList - Введение
 *
 * Java Collections Framework - Реализован функционал по хранению обьектов. Место, где хранятся обьекты называется коллекция или коллекция это набор обьектов или набор связанных классов и интерфейсов.
 *
 * Встроенный метод (java.util.ArrayList) ArrayList позволяет добавалять, удалять, получать любое колличество обьектов. Это динамический массив, размер ограничен лишь выделяемой памятью на компьютере.
 *
 * Cхема (scheme)
 * ArrayList -> List -> Collection -> Iterable
 * ArrayList ->  ..this Class
 *             List -> Collection -> Iterable ..this Interface
 *
 * Интерфейс List реализуют классы ArrayList, LinkedList, Vector
 * Все классы параметризованные, тоесть нужно указывать тип данных.
 * ArrayList<Integer> arraylist = new ArrayList<>();
 * только ссылочные типы, никаких примитивов так как используем дженерики
 *   У класса переопределён метод toString, поэтому можно вызывать напрямую sout
 *  Проходимся по элементам ArrayList с помощью:
 *
 *  1.естественно цикл!
 * for(int i=0; i<arrayList.size(); i++)
 * System.out.println(arrayList.get(i));
 *
 *  2.for each
 * for(Integer x : arrayList)
 * System.out.println(x);
 *
 *  3. C помощью лямбды
 *
 *
 * .remove(5) удаление по индексу
 *  Очень не эффективен, если удаляем в начале или в середине ArrayList
 * Так как происходит перезапись ячеек массива с права на лево. Старый масcив будет удалён,
 * а в новом произойдет сдвиг слева на право. Что может занять много времени. (Для этого исп. LinkList)
 *
 * Конвенция.
 *  Ссылаем на тип интерфейса LIST ! (Смотри схему) Работает потому, что у нас есть полиформизм и даункастинг.
 *
 *  Можем перенную arrayList сослать на класс LinkedList
 * arrayList = new LinkedList<>();
 * и теперь можем эффективно удалять обьекты
 */

public class TestArrayList {
    public static void main (String[] args){
        // Создаем ArrayList c начальным размером 20 ячеек (снижаем к-во перекопирований внутреннего массива)
        List<Integer> list = new ArrayList<>(20);
        // Добавляем значение в конец списка (default)
        list.add(55);
        System.out.println("Add one digit to massiv "+list);
        // Заполняем массив с помощью цикла
        for (int i=0; i < 10; i++){
            list.add(i);
        }
        // у класса переопределён метод toString, поэтому вызывать напрямую
        System.out.println("Completed massiv "+list);
        // Удаляем значение по индексу (Remove value index)
        list.remove(1);
        // Получаем размер массива.  Give me size massiv
        System.out.println("Size massiv "+list.size());
        // Переназначаем переменную list
        list = new LinkedList<>();
        //list.remove(3);
        System.out.println("LinkedList "+list);
    }
}
