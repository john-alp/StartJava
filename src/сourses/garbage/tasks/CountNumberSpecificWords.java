package сourses.garbage.tasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap
 */
public class CountNumberSpecificWords {

    private String fileReaderMethodChar() {
        StringBuilder stringBuilder = new StringBuilder();
        String text = "empty of char";
        int i = 0;
        int character = 0;
        try (FileReader fileReader = new FileReader("resources/crocodileEng.txt")) {
            while ((character = fileReader.read()) != -1) {
//                System.out.println(i++);
               text = stringBuilder.append((char)character).toString();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private String fileReaderMethodReadLine() {
        String text = "empty of readLine";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/crocodileEng.txt"))) {
            while ((text = bufferedReader.readLine()) != null) {
                // System.out.println(text);
                //  text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private String fileAnalysis() {
        Map<String, Integer> map = new HashMap<>();

        for (String str : fileReaderMethodChar().split(" ")) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        //System.out.println(map.toString());
        return map.toString();
    }

    public static void main(String[] args) throws IOException {
        CountNumberSpecificWords countWords = new CountNumberSpecificWords();
        // System.out.println("main " + countWords.fileReaderMethodReadLine());
        // System.out.println("main " + countWords.fileReaderMethodChar());
        System.out.println("main " + countWords.fileAnalysis());
    }
}
//            for(String str : phrase.split(" ")) {
//                if(map.get(str) != null) {
//                    int temp = 0;
//                    temp += map.get(str);
//                    System.out.println(map.get(str) + temp);
//                } else {
//                    map.put(str,1);
//                }

//            bufferedReader =  new BufferedReader(new FileReader("resources/crocodileEng.txt"));
//            while ((strCurrentLine = bufferedReader.readLine()) != null) {
//                System.out.println(strCurrentLine);
//            }
//            bufferedReader.close();
//                stringBuilder.append(br.readLine());
//                System.out.println(stringBuilder.toString());