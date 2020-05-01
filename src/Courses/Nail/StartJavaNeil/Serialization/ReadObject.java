package Courses.Nail.StartJavaNeil.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("peopleSerialization.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
                Person person1 = (Person) ois.readObject();  //(Person) это доункастинг
                Person person2 = (Person) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
