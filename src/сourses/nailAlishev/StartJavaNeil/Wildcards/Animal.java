package сourses.nailAlishev.StartJavaNeil.Wildcards;

public class Animal {
    private int id;
    public Animal(int id){  // конструктор
      this.id = id;
    }
    public Animal(){
                            // пустой конструктор для extends class Dog
    }
    public String toString(){    // Переназначаем toString
        return String.valueOf(id);  // valueof - переформатируем строку int в String
    }
    public void eat(){
        System.out.printf("I am Animal%s%n"," ");
    }
}
