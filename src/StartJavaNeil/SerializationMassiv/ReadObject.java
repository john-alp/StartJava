package StartJavaNeil.SerializationMassiv;

import StartJavaNeil.SerializationMassiv.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("peopleSerialization.bin"))){
           Person person1 = (Person) ois.readObject();
            System.out.println(person1);
        //ois.close(); нет необходимости
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//FileInputStream fis = new FileInputStream("peopleSerialization.bin");
//ObjectInputStream ois = new ObjectInputStream(fis);
// int personCount = ois.readInt();
//Person[] people = new Person[personCount];
//for(int i=0; i < personCount; i++){
//    people[i] = (Person) ois.readObject();