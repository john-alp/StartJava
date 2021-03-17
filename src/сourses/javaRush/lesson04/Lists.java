package сourses.javaRush.lesson04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {
        Random random = new Random(55);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            //arrayList.add(i);
            linkedList.add(i);
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList.size());
        System.out.println(linkedList.size());

        arrayList.remove(3);
        linkedList.remove(4);
        linkedList.remove(5);

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList.size());
        System.out.println(linkedList.size());
    }
}
