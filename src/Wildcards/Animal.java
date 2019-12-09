package Wildcards;

public class Animal {
    private int id;
    public Animal(int id){  // конструктор
      this.id = id;
    }
    public String toString(){    // Переназначаем toString
        return id + " ";
    }
}
