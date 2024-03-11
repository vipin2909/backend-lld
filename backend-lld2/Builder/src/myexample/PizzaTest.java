package myexample;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.NyBuilder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        System.out.println(nyPizza);




    }
}
