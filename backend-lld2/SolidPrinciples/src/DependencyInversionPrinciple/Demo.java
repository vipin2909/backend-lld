package DependencyInversionPrinciple;

public class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);
        // this will execute Research constructor code and give person who is parent and whose name is john
        new Research(relationships);
    }
}
