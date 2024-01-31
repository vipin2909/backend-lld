package employee;

public class Employee {
    String name;
    int salary;
    static String ceo;

    void printDetails() {
        System.out.println(name+" : "+salary+" : "+ceo);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ram";
        e1.salary = 1000000;
        e1.ceo = "Akash";


        e1.printDetails();

        Employee e2 = new Employee();
        e2.name = "Karan";
        e2.salary = 20000;
        e2.ceo = "Akash";


        e2.ceo = "Manisha";
        e1.printDetails();
        e2.printDetails();


    }
}

// this is available to class and present in class loader memory

// as it is same class Employee to understand it better run same code in different class
// by creating Employee e1, e2 object same as stated in example above

// if want to make something static that is shared over complete class and
// also constant then use final keyword

// Example static final String ceoName = "Manisha";