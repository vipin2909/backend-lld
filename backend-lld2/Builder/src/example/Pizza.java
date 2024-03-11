package example;

import java.util.HashSet;
import java.util.Set;

public class Pizza {

    public enum Topping {
        SAUSAGE,
        ONION,
        CHILLI_POWDER,
        CHUTNEY,
        OLIVE
    }


    Set<Topping> toppings;

    static class Builder<SELF extends Builder<SELF>> {
        Set<Topping> toppings = new HashSet<>();
        public SELF addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        public SELF self() {
            return (SELF) this;
        }

        public Pizza build() {
            return new Pizza(this);
        }


    }

    Pizza(Builder<?> builder) {
        this.toppings = builder.toppings;
    }




}
