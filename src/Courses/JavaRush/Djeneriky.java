package Courses.JavaRush;
import java.util.*;

public class Djeneriky {
    public static void main(String []args){
            List list = new ArrayList();
            list.add("Hello");
            String text = list.get(0) + " "; // конкатенации для объекта будет вызван статический метод String.valueOf(obj),
                                             // который в итоге вызовет метод toString для Object.
            System.out.print(text);
        /**
         * Нам больше не нужно приведение к String. Кроме того, у нас появились угловые скобки (angle brackets),
         * которые обрамляют дженерики. Теперь компилятор не даст скомпилировать класс, пока мы не удалим добавление 123 в список, т.к. это Integer.
         * Он нам так и скажет.
         * После компиляции какая-либо информация о дженериках стирается. Это называется "Стирание типов" или "Type Erasure".
         */

            List<String> list2 = new ArrayList<>();
        list2.add("Hellooo");
        //list2.add(123);          // <----
        for (Object str : list2) {
            System.out.println("-" + str);
        }
        }

}
