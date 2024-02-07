package foobaralternate;

public class Main  {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(5);
        PrintBar printBar = new PrintBar();
        PrintFoo printFoo = new PrintFoo();
        try {
            for(int i = 0; i < 5; i++) {
                fooBar.foo(printFoo);
                fooBar.bar(printBar);
            }
        }

        catch(InterruptedException e) {
            e.printStackTrace();
        }


    }
}
