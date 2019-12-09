public class ObjectTest {
 public static void main(String[] args){
  Tiger tiger = new Tiger();
  Cat cat = new Tiger();
  Animal animal = new Tiger();
  Object obj = new Tiger();

 }
}


class Animal {
 public void doAnimalActions(){}
}
class Cat extends Animal {
 public void doCatActions(){}
}
class Tiger extends Cat {
 public void doTigerActions(){}
}
