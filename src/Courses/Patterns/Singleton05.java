package Courses.Patterns;

public class Singleton05 {
    public static void main(String[] args) {
Singleton singleton = Singleton.getInstance();
Singleton singleton2 = Singleton.getInstance();
singleton.i = 4;
singleton2.i = 9;
        System.out.println(singleton.i);
        System.out.println(singleton2.i);
    }
}
class Singleton {
    private Singleton(){}
    int i = 0;
    private static Singleton singleton = new Singleton();
public static Singleton getInstance(){
    return singleton;
}
}