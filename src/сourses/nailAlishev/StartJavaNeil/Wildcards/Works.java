package сourses.nailAlishev.StartJavaNeil.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Wildcards Урок 34   09.12.2019
 *
 *     <?> wildcard
 *      <? extend class>  можно добавлять обьекты от родительского класса до всех наследников (вниз)
 *      <? super class>   можно добавлять обьекты от родительского класс до Object (вверх)
 */
public class Works {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>(); // могут храниться только обьекты класса Animal (<Animal>)
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>(); // только обьекты класса Dog (<Dog>)
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);                // не смотря на полиморфизм(Dog наследник Animal), я не могу передать массив обьектов просто так
                                        //
    }
        // private static void test(List <Animal> list) {   // на вход применяем List животных
        private static void test(List <? extends Animal> list) {     // теперь в этот метод я могу передать любой List Родителя и наследника
                for (Animal animal : list) {                         // тоесть сверху в низ. <? super Animal> добавить от Анила к Обьежкту
               // System.out.println("Привет из listOfAnimal! id: "+animal);
                    animal.eat();
            }

        }

class Vclasse{

}
}