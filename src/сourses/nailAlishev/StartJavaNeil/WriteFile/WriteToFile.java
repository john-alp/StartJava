package сourses.nailAlishev.StartJavaNeil.WriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);
        pw.println("May");
        pw.println("May2");
        pw.close();
    }
}
