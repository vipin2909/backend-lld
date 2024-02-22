package singleResponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
    public void saveToFile(Journal journal, String fileName, boolean overWrite) throws FileNotFoundException {
        if(overWrite || new File(fileName).exists()) {
            try(PrintStream printStream = new PrintStream(fileName)) {
                printStream.println(journal.toString());
            }
        }
    }

//    public Journal load(String fileName) {}

//    public Journal load(URL url) {}
}
