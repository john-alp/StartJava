package JavaRush;

public class Olga {
    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga is " + olga.age+olga.name);
        System.out.println("Vera is " + vera.age+vera.name);

        ageSwap(olga, vera);

        System.out.println("Olga is " + olga.age+olga.name);
        System.out.println("Vera is " + vera.age+vera.name);
    }
    private static void ageSwap(Student a, Student b)   // что интересно, у метода тип данных указан Класс и из него подтягиваются данные из полей
    {
        System.out.println("a "+a);
        int c = a.age;
        a.age = b.age;
        b.age = c;
        String w = a.name;
        a.name = b.name;
        b.name = w;
    }

    static class Student   // Класс обьявлен в классе :-о
    {
        String name;
        int age;
    }
}
