package InterfaceSegregation;

public interface Machine {
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d);

}


