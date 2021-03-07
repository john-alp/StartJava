package сourses.nailAlishev.StartJavaNeil.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/** Урок 45
 *  28.12.2019  Серилизация
 * здесь будем записывать обьекты в файл
*/
public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"John");
        Person person2 = new Person(2,"Tatiana");

        try {
            //  FileOutputStream Обьект этого класса побайтно записывает любую информацию в файл
            FileOutputStream fos = new FileOutputStream("peopleSerialization.bin");
            // ObjectOutputStream Более конкретный и специализированный. Для записи обьектов..
            // но что бы записывать обьекты ему нужен болле абстракный класс FileOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
