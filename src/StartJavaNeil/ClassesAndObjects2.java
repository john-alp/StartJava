/**
 *  Сеттеры и геттеры. 18 урок. Инкапсуляция.  05.12.2019
 */

public class ClassesAndObjects2 {
    public static void main(String [] args){
        People john = new People();
        People tanya = new People();
        john.setName("Евгений");
        john.setAge(41);
        System.out.println(john.getName()+john.getAge());
    }
}
class People{            // Важно - поля должны быть видны только внутри класса
    private String name; // поле класса People. private - возможно обращение к переменной только в нутри класса
    private int age;     // поле класса
    // сеттер строки
    public void setName(String name){
        if(name.isEmpty()){     // isEmpty - встроенный метод из класса стринг. Если пустая строка, то тру и выполняется тело
            System.out.println("Нет имени");
        }else{
            this.name = name;  //this указывает джаве переменную, которая пренадлежит классу (здесь класс People)
        }
    }
    // геттер строки
    public String getName(){
        return name;     // при вызове этого метода(геттер) будет возвращаться значение name из поля класса
    }
     // сеттер числа
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Возраст должен быть положительным!");
        }else{
        age = userAge;
        }
    }
    // геттер числа
    public int getAge(){
        return age;
    }

//    String speak()


}