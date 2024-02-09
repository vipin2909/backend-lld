import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(1);
        s1.add(-1);
        s1.add(4);

        for(Integer i: s1) {
            System.out.println(i);
        }


        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(1);
        s2.add(-1);
        s2.add(4);

        for(Integer i: s2) {
            System.out.println(i);
        }

        Payment p = new Payment();
        p.status = PaymentStatus.PENDING;
//        System.out.println(p.status+"PART IS " + instanceof p.status);

        Set<PaymentStatus> set = EnumSet.allOf(PaymentStatus.class);

        for(PaymentStatus ps: set) {
            System.out.println(ps);
            System.out.println(ps instanceof PaymentStatus);
        }
    }

}