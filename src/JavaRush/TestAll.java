package JavaRush;

import java.util.Date;
import java.util.Scanner;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/


public class TestAll {
        public static void main(String[] args) {
            Zerg zerg = new Zerg("Strong");
            Protos protos = new Protos("Stream");
            Terran terran = new Terran("Tirran");
            System.out.println(zerg.name);
        }
    }

class Zerg{
    String name;

    public Zerg(String str){
    this.name=str;
    }


}
class Protos{
    public Protos(String ... name){

    }

}
class Terran{
    public Terran(String... may){

    }
}


