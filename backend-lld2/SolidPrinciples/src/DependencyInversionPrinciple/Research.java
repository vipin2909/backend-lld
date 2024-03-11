package DependencyInversionPrinciple;

import java.util.List;
import java.util.stream.Stream;

public class Research { // high-level

//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        // has to find person name john who is also a parent
//                relations.stream()
//                .filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
//                .forEach(ch -> System.out.println("john has a child called " + ch.getValue2().name));
//    }

    public Research(RelationshipBrowser relationshipBrowser) {
        List<Person> children = relationshipBrowser.findAllChildrenOf("john");
        for(Person child: children) {
            System.out.println("John has a child called " + child.name);
        }
    }
}
