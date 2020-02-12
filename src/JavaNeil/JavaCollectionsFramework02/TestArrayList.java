package JavaNeil.JavaCollectionsFramework02;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main (String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < 100; i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(5);
        System.out.println();
        System.out.println(list.size());
    }
}
