package myexample;

public class NyPizza extends Pizza {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        HUGE
    }

    Size size;

    static class NyBuilder extends Pizza.Builder<NyBuilder> {
        Size size;

        public NyBuilder withSize(Size size) {
            this.size = size;
            return self();
        }

        public NyBuilder(Size size) {
            this.size = size;
        }

        public NyPizza build() {
            return new NyPizza(this);
        }

        public NyBuilder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Topping str: toppings) {
            sb.append(str+", ");
        }
        return "Toppings: " + sb.toString() + "\nSize: " + this.size;
    }

    public NyPizza(NyBuilder nyBuilder) {
        super(nyBuilder);
        this.size = nyBuilder.size;
    }


}
