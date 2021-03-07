package сourses.zaurTregulov.lamda06;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hello my friend!"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
        def((str) -> str.length());
        def(String::length);
        String d = "";
        d.indexOf(5);
    }
}

interface I {
    int abc(String s);
}

