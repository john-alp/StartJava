package JavaNeil.JavaCollectionsFramework02.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    // таблица ключ/значение  Реализуют метод тоСтринг
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(3, "May"); // перезапишет  Не может быть дубликатов

        System.out.println(map);

        map.get(1); // получаем значение по ключу ("One")  если указать не существующий то вернётся нулл


//    Пройти по всему мапе с помощью цикла for
//    Структура данных подразумевает что это одно значение (1,"One")
//
        for (Map.Entry<Integer, String> entry : map.entrySet()) {    // entrySet - выводит ключ/значение в этой мэп
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
