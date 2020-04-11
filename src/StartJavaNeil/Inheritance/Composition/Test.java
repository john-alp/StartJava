package StartJavaNeil.Inheritance.Composition;

/** 11.03.2020
 * Пытаемся разобраться с Композицией, так как это направление на курсах не освещалось
 * https://javadevblog.com/chto-takoe-kompozitsiya-primer-kompozitsii-v-java.html
 */

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println(salary);

        Person demiurg = new Person();
        System.out.println(demiurg.getMoto());
    }
}

