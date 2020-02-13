package JavaNeil.JavaCollectionsFramework02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** 13.02.2020  ..004 Связный список LinkedList. Введение.
 *  Значения гораздо быстрее добавлять в ArrayList, чем LinkedList (в примере в два раза), по дефолту, в конец листа. Считывание по идексу, ArrayList быстрее в 1000 раз!
 *
 * list.add(0, 100) (index, object) добавляет значения в начало списка. Тепербь всё наоборот, так как ArrayList нужно каждый раз перезаписывать внутрений массив.
 *  Для добавления нужно сдвинуть все элементы в право [1][2][3] -> [0][1][2][3]
 *
 * Для массива получить элемент очень быстро
 *
 * в LinkList ещё нужно последовательно дойти до нужного обьекта
 * состоит из обьектов, у каждого обьекта есть ссылка на следующий.
 * Поэтому, не нужно перезаписывать все обьекты, а просто добавляем ссылку с нового обьекта на старый
 *
 * head -> [1]->[2]->[3]
 * добавляем [5]
 * [5]->[1]->[2]->[3]
 */
public class TestLinkedList{
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        measureTime(arrayList);
        measureTime(linkedList);
        }

        private static void measureTime(List<Integer> list){
        // В этом блоке записываем в ArrayList and LinkedList
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) list.add(i);
        long end = System.currentTimeMillis();
            System.out.println("Time list.add a workind "+ (end - start));
        // В этом блоке получаем данные из ArrayList and LinkedList
            long start2 = System.currentTimeMillis();
            for(int j=0; j<100_000; j++) list.get(j);
            long end2 = System.currentTimeMillis();
            System.out.println("Time list.get a workind "+ (end2 - start2));

        }
}
