package example;

public class NyPizza extends Pizza {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        HUGE,
    }
    Size size;

    static class Builder extends Pizza.Builder<Builder> {
        Size size;

        Builder(Size size) {
            this.size = size;
        }

        public NyPizza build() {
            return new NyPizza(this);
        }

        public Builder self() {
            return this;
        }



    }

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(example.Pizza.Topping str: toppings) {
            sb.append(str+", ");
        }
        return "Toppings: " + sb.toString() + "\nSize: " + this.size;
    }
}
