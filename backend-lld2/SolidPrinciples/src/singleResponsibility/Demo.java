package singleResponsibility;

public class Demo {

    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("I Cried today");
        journal.addEntry("I Ate a bug");

        System.out.println(journal);

        Persistence p = new Persistence();
        String fileName = "C:\\Users/Administrator/Desktop/backend/backend-lld2/SolidPrinciples/src/singleResponsibility/journal.txt";
        p.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
