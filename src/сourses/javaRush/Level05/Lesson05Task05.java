package сourses.javaRush.Level05;
/**
 * Провести три боя  попарно между котами. Создать три кота используя класс Cat.
   Провести три боя попарно между котами.
   Для боя использовать метод boolean fight(Cat anotherCat). Результат каждого боя вывести на экран.
*/
 public class Lesson05Task05 {
    public static void main (String[] args){
    String people = "May";
    String people2 = "May";
        System.out.println(people.equals(people2));

        Cat1 barsik = new Cat1();
    Cat1 kesha = new Cat1();
    Cat1 mursik = new Cat1();
    Cat1 win = new Cat1();
    barsik.setAll(10, 3,15,"Barsik");
    kesha.setAll(2,2,10,"Kesha");
    mursik.setAll(5,3,6,"Murzik");

        if (fight(barsik, kesha)){
            win = barsik;
            System.out.println("The cat win " + barsik.getName() + "!");
        } else {
            win = kesha;
            System.out.println("The cat win " + kesha.getName() + "!");
        }
        if (fight(win,mursik)) System.out.println("The cat win " + win.getName() + "!");
        else System.out.println("The cat win " + mursik.getName() + "!");
}
    public static boolean fight (Cat1 anotherCat, Cat1 anotherCat2){
     if (anotherCat.equals(anotherCat2)) return true;
        else return false;
    }
 }

 class Cat1 {
     private int age, weight, strength;
     private String name;

     public void setAll(int age, int weight, int strength, String name){
         this.age = age;
         this.weight = weight;
         this.strength = strength;
         this.name = name;
     }
     public String getName(){
         return name;
     }

     @Override
     public boolean equals(Object o) {
        if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Cat1 cat1 = (Cat1) o;

         return strength == cat1.strength;
     }

     @Override
     public int hashCode() {
         return strength;
     }
 }
