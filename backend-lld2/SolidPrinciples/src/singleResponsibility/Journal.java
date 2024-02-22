package singleResponsibility;


// separation of concerns
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();

    // count total number of entries across journal
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
        --count;
    }

    // these below functions are defined in persistence class due to separation of concerns
    // to prevent the breaking of single responsibility principle

//    public void save(String fileName) throws FileNotFoundException {
//        try(PrintStream out = new PrintStream(fileName)) {
//            out.println(toString());
//        }
//    }
//
//
//
//    public void load(String fileName) {
//
//    }
//
//    public void load(URL url) {
//
//    }




    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }






}
