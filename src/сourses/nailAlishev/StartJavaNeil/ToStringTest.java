public class ToStringTest {
    public static void main (String[] args){
        // любой класс наследуется от класса object, при наследованнии наследуются все поля и методы
        // toString нужен для переопределения обьекта
        //Он используется для получения строкового представления объекта. Каждый раз, когда мы пытаемся вывести ссылку на Object,
        // вызывается метод toString().
        //
        //Если мы не определили в классе метод toString(), то будет вызван метод toString() класса Object. И будет содержать уникальный хэш код

        Auto mazda = new Auto();
        System.out.println(mazda);
        System.out.println(mazda.toString()); // то же самое. Тоесть когда мы выводим обьект, он всё равно обращается к toString
    }
}
 class Auto{
    String name = "Mazda";
 public String toString(){  // Cигнатура метода. Переопределяем toString
    return "avtomobile"+" "+name;
 }
 }
