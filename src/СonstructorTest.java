public class СonstructorTest {
    public static void main(String[] args) {

        Human tanya = new Human();                              // пустой обьект tanya, сработает 1 конструктор
        Human demiurg = new Human("demiurg",41);   // создаю обьект demiurg, с именем и возрастом, сработает 2 конструктор
        demiurg.setName("May");                                    // могу перезаписать переменную name, вызвав сеттер set.Name
        System.out.println("demiurg: "+demiurg.getName()+demiurg.getAge());
        System.out.println("Tanya: "+tanya.getName()+tanya.getAge());
        demiurg.speak();
        tanya.speak("myrk");
    }
}
 class Human{                                     // класс
   private String name;                                    // поля
   private int age;
   static final String CONSTANT = "CONSTANT MAY - константы нельзя изменить и пишутся БОЛЬШИМИ буквами";

    public Human(){
        System.out.println("Привет из первого, пустого конструктора!");
     }

    public Human(String name,int age) {         // конструктор, который требует два аргумента стринг и интовый
        this.name = name;
        this.age = age;
        System.out.println("Привет из второго конструктора, есть name и age");
    }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        void speak(){
            System.out.println("empty");
        }
        void speak(String name){
            System.out.println(name);
        }
 }