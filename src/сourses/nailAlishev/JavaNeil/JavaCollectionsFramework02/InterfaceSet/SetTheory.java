package сourses.nailAlishev.JavaNeil.JavaCollectionsFramework02.InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class SetTheory {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        // union обьединение двух Сетов Сет1 и Сет2
        // В итоге в union попали недастающие цифры
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union "+union);

//        intersection - пересечение множеств
//        оставляет в Сете1 все элементы которые есть в Сете2
        // retainAll оставляет в исходном множестве(сет1) только те значения которые присутствуют в множестве переданным в качестве аргумента (Сет2)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection "+intersection);

        // difference разность множеств
        // removeAll противоположность методу retainAll -

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference "+difference);
    }
}
