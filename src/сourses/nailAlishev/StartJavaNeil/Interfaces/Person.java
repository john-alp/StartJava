package сourses.nailAlishev.StartJavaNeil.Interfaces;

public class Person implements Info {
    public String name;

    public Person(String name){
        this.name = name;
    }
    public void showInfo(){    // эта сигнатура совпадает с сигнатурой указанной в имплементированном интерфейсе
       // System.out.printf("Yra is inteface Info %s%n"+this.name);
        System.out.println("Yra is inteface Info "+this.name);
    }
    public void sayHello(){
        System.out.printf("Я человек %s%n","привет вам!");
    }
}
