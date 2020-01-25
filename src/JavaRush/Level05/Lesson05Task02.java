package JavaRush.Level05;
/** 20.01.2020  сделала Таня
 *  Реализовать метод fight
 Реализовать метод boolean fight(Cat anotherCat):
 реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
 т.е. возвращать true, если выиграли и false - если нет.
 Должно выполняться условие:
 если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
 */
public class Lesson05Task02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAll(5,3,15,"Barsik");
        Cat cat2 = new Cat();
        cat2.setAll(8,4,16,"Murzik");
        System.out.println(cat1.fight(cat2));
    }
}

class Cat {
    private int age, weight, strength;
    private String name;

    public void setAll(int age, int weight, int strength, String name) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.name = name;
    }

    public boolean fight(Cat cat) {
        if (this.strength > cat.strength) return true;
    else return false;
    }
}
