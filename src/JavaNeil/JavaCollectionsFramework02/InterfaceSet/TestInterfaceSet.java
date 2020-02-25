package JavaNeil.JavaCollectionsFramework02.InterfaceSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set - переводится как множества
 * Set - коллекуия которая хранит только уникальные элементы
 * Реализован toString
 * Не может быть два одинаковых обьекта
 *
 * есть ли обьект в Сете  работает очень быстро использует кэш возвращает тру или фолз
 * contains
 *
 * isEmpty
 * проверяет путой Сет или нет (вернёт фолз если что-то есть)
 *
 * java Set  смотрим официальную документацию
 */

public class TestInterfaceSet {
    public static void main(String[] args) {
        //Set - хранят в себе только одиночные, уникальные элементы
        // выводятся без порядка
        Set<String> hashSet = new HashSet<>();
        // выводится по принципу, в каком порядке положил, так и заберешь
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // выводится отсортированным по значению данных (естественный порядок и л)
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Tatiana");
        hashSet.add("Daria");
        hashSet.add("John");
        linkedHashSet.add("Tatiana");
        linkedHashSet.add("Daria");
        linkedHashSet.add("John");
        treeSet.add("Tatiana");
        treeSet.add("Daria");
        treeSet.add("John");


        System.out.println("-----HashSet----");
        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println("----LinkedSet-----");
        for(String name : linkedHashSet) System.out.println(name);
        System.out.println("----treeSet-----");
        for(String name : treeSet) System.out.println(name);
        System.out.println();
        System.out.println("---isEmpty---");
        System.out.println(hashSet.isEmpty());
        System.out.println();
        System.out.println("---- Есть ли в Сете значение (contains) \"John\"   true and false -----");
        System.out.println(hashSet.contains("John"));
        System.out.println();
    }
}