package Calculate;

public class Test3 {
    public static void main(String[] args) {
        Z z = new Z();
        z.print(Object.class);
    }
}
     class Z {
        public void print(Object o) {
            System.out.println("Object");
        }

        public void print(String str) {
            System.out.println("String");
        }

        public void print(Integer i) {
            System.out.println("Integer");
        }


    }


