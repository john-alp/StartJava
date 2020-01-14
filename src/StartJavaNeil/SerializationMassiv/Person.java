package StartJavaNeil.SerializationMassiv;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;  // transient  исключить элемен из сериализации
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
