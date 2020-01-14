package StartJavaNeil.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 484837483734L;  // уникальный индификатор изменений в сериализуемом классе
    private int id;
    private String name; // transient  исключить элемен из сериализации  private transient String name

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : "+name;
    }
}
