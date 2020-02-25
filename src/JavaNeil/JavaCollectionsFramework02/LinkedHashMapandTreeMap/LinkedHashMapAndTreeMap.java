package JavaNeil.JavaCollectionsFramework02.LinkedHashMapandTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/** 24.02.2020  LinkedHashMap и TreeMap
 * public native - native реализация метода вынесенна, например на C++
 * Могу сказать, что всё понятно
 */


public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {
        // В каком порядке положили в таком и получиим
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // Сортировка по ключу () ()Лексико графический порядок
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(linkedHashMap);
           System.out.println("---------------------");
        testMap(treeMap);
    }
        // Используют один и тот же Интерфейс, поэтому можем передавать различные
        public static void testMap (Map<Integer, String> map){
            map.put(41, "John");
            map.put(9, "Daria");
            map.put(37,"Tatiana");
            map.put(71, "Galya");

for (Map.Entry<Integer, String> entry : map.entrySet() ){
    System.out.println(entry.getKey()+" : "+entry.getValue());
}

    }
}
