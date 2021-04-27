package сourses.garbage.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Temp {
    static String strCurrentLine;

    public static void main(String[] args) {
        BufferedReader objReader = null;
        try {
            objReader = new BufferedReader(new FileReader("resources/crocodileEng.txt"));
            while ((strCurrentLine = objReader.readLine()) != null) {
                          System.out.println(strCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(strCurrentLine);
    }
}
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String str : strCurrentLine.split(" ")) {
//
//            if (map.containsKey(str)) {
//                map.put(str, map.get(str) + 1);
//            } else {
//                map.put(str, 1);
//            }
//        }
//        System.out.println(map.toString());
//    }

