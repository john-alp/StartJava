/**
 *
 * Static делает метод достоянием класса, а не объекта, поэтому всегда будет вызываться метод суперкласса.
 */
public class StaticTest {
    public static void main(String[] args){
        NewHuman.description = "Переменная класса";
        NewHuman.getDescription();  // Выводим значение переменной, без создания обьекта
        NewHuman demiurg = new NewHuman("Евгений",40);  // создаем новый обьект demiurg с двумя аргументами
        NewHuman.description = "Новая переменная класса";  // переопределяем переменную класса, через обьект
        NewHuman.getDescription();  // Выводим значение переменной, без создания обьекта
        System.out.println();       // чистая строка
        demiurg.getAllFields();     // запускаем метод через обьект demiurg

        // не нужно создавать обьект класса, что бы воспользоваться переменными класса
        // напримкер
        System.out.println(Math.pow(2,5)); // встроенный класс, обращаемся к статическому методу pow напрямую
        System.out.println(Math.PI);  // обращение к статичесской константе PI, в строенном классе Math
    }
}
 class NewHuman{
    private String name;     // переменная обьекта
    private int age;

    public static String aName = "Где твоё имя?";  // переменная класса (static) будет доступна для всех методов
    public static int aAge = 100;
    public static String description;

    public NewHuman(String name, int age){ // конструктор, с двумя аргументами
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println("name: "+name+", age: "+age+", aName: "+aName+", aAge: "+aAge+", description: "+description);
    }
    public static void printAllFields(){   // статический метод, может использовать только статические переменные
                                            // не может использовать переменные обьекта, потому что переменные обьекта существуют у какого-то обьекта
                                            // Нужно, если нужно изолировать метод от переменных класса
        System.out.println("static"+description);

    }
 }
