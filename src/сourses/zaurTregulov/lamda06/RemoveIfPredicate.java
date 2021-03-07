package сourses.zaurTregulov.lamda06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveIfPredicate {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("May", "Kroko", "Analinsky Jalyab", "Predicate"));
//        Predicate<String> predicate = element -> element.length() > 3;
//        arrayList.removeIf(predicate);
        arrayList.removeIf(element -> element.length() > 3);
        System.out.println(arrayList);
    }
}
