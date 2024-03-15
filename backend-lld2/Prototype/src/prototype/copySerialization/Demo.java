package prototype.copySerialization;

public class Demo {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "Life");
//        Object gets serialized and deserialized and if object contains other objects
        // those also get serialized and deserialized
//        Foo foo2 = SerializationUtils.roundtrip(foo);
//        foo2.whatever = "xyz";
//        System.out.println(foo);
//        System.out.println(foo2);

    }
}
