package сourses.patterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 17.03.2021
 * Фасад — это структурный паттерн проектирования, который предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.
 * Здесь вынес функционал в класс FileReadFacade, а в классе Facade, лишь обращаюсь к этому классу
 *
 */

public class Facade {
    public static void main(String[] args) throws IOException {
        String readFile = "resources/liguria.txt";
        FileReadFacade frf = new FileReadFacade();
        System.out.println(frf.readFile(readFile));
    }
}

class FileReadFacade {
    public String readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while ((i = br.read()) != -1) {
            sb.append((char) i);
        }
        return sb.toString();
    }
}


