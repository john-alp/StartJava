/**
 *  Урок 23. Есть ДВА типа обьектов - Они являются неизменяемыми, или Immutable.
 *  все классы-обертки над примитивными типами — неизменяемые.
 *  Integer, Byte, Character, Short, Boolean, Long, Double, Float — все эти классы создают Immutable объекты.
 *  И изменяемые
 */
public class StringBuilderTest {
    public static void main (String[] args){
        // например, класс String неизменяемый
        String x ="hello";  // этот обьект не зменится до конца программы, можем только модернизировать и
        // после перезаписи ниже, на область памяти hello больше никто не ссылается и вскоре память будет зачищина "сборщиком мусора"
        x.toUpperCase();   // встроенный метод toUpperCase должен преобразовать hello в HELLO, но этого не произойдёт,
                            // так как нельзя изменить обьект класса String, можно ьолько создать новый(перезаписать)
        System.out.println(x);

        x=x.toUpperCase();
        System.out.println(x);   //  а вот тут всё у меня получится, так как строка "x" перезаписывается

       // Далее
        String a = "Hello";
        String b = " my ";
        String c = "friend";
        System.out.println(a+b+c);  // так как конкатенация строк подразумевает их изменение, а это невозможно (Строинг не изменяемы класс),
                                    // то в памяти создаются дополнительные строки, что занимает память и замедляет выполнение прогаммы.
                                    // если строк для конкатенации много, то разумнее использовать изменяемый встроенный класс StringBuilder
        System.out.println("---------------------------- StringBuilder ---------------------------");
        StringBuilder d = new StringBuilder("Hello");
        System.out.println(d);
        d.append(" my "); // модернизируем переменную d, не перезаписывая
        d.append("friend");
        //d.append(" my ").append("friend");  // аналог двух строк вверху
        System.out.println(d);    //
        System.out.println("---------------------------- Printf ---------------------------");
                                            // Хороший материал, позже поэксперементировать.
                                            // http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
        System.out.printf("%s\n","Privet mir of Printf");
        System.out.println("May");
    }
}
