package Courses.Nail.StartJavaNeil.NestedСlass;


public class Electrocar {
  private int id;   // поле обьекта
  private static int staticId; // поле класса
  // вложенный класс, нестатический класс
  private class Motor{   //  Имеет доступ к полям обьекта (id)
                         // Разграничиваем логику - в общем классе Электрокар, у нас бутет класс Двигатели, коробка передач итд
                         // нужно для упрощения сложного класса
                         // обычно имеет модификатор private
       public void startMotor(){
           System.out.println("Motor is starting");
       }
  }

  // вложенный статический класс
    public static class Battery{   // имеет гораздо меньшее отношение к классу Электрокар, не имеет доступа к полям обьекта электрокар
                                    // единственное, что его связывает, так это доступ к статическим полям Электрокар
      // ещё есть логика.. Мы хотим что бы класс батарея был связан с классом электрокар
      // обычно используется из вне, поэтому имеет модификатор public
      public void charge(){
          System.out.println("Battary is charding...");
      }

  }

    public Electrocar(int id) {   // конструктор
        this.id = id;
    }
    public void start(){
      final int x = 1;
      Motor motor = new Motor();    // в методе создаем обьект вложенного класса мотор и переменной класса мотор
      motor.startMotor();           // запускаем метод из класса мотор
        System.out.println("Electrocar "+id+" in starting!");
      // третий метод создание вложенного класса в методе
        // в методе вложенного класса доступ к полям как в классе электрокар, так и доступ к полям метода. Ограничение - переменная должена быть финализированна
       class SomeClass{  // чем-то похоже на анонимные классы
           public void somemetod(){
               System.out.println(x);
               System.out.println(id);
           }
       SomeClass someClass = new SomeClass();
           private void test(Object object){

           }
       }
    }

}