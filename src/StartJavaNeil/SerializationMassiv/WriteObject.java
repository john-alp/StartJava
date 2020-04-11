package StartJavaNeil.SerializationMassiv;

import StartJavaNeil.Serialization.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/** Урок 46
 *  29.12.2019  Серилизация массивов
 *  будем записывать массивы в файл
*/
public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"John"), new Person(2,"Tatiana"), new Person(3,"Daria")};
        try {
            FileOutputStream fos = new FileOutputStream("peopleSerialization.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Способ первый
            // Указываем длинну массива
             oos.writeInt(people.length);
             for(Person person: people){
                 oos.writeObject(people);
             }
             oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
