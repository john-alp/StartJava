package Courses.Nail.StartJavaNeil.Interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void showInfo(){ // эта сигнатура совпадает с сигнатурой указанной в имплементированном интерфейсе
      //  System.out.printf("May is inteface Info %s%n"+this.id);
        System.out.println("May is inteface Info"+this.id);
    }

    public void sleep(){
        System.out.printf("I am Animal %s%n","и я сплю");
    }
}
