package Patterns;

import java.sql.SQLOutput;

public class Factory02 {
    public static void main(String[] args) {
    Factory factory = new Factory();
    Car toyota = factory.create("Toyota");
    Car mazda = factory.create("Mazda");
    toyota.drive();
    mazda.drive();
    }
}
interface Car{
    void drive();
}
class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("It's Toyota");
    }
}
class Mazda implements Car{
    @Override
    public void drive(){
        System.out.println("It's Mazda");
    }
}

class Factory{
    public Car create(String typeOfCar){
      switch (typeOfCar){
          case "Toyota" : return new Toyota();
          case "Mazda" : return new Mazda();
          default : return null;
      }
    }
}