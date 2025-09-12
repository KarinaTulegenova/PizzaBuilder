public class Pizza {

    private final String topping;
    private final String size;
    private final String dough;
    private final String sauce;

    private Pizza(Builder builder) {
        this.topping = builder.topping;
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
    }

    public static class Builder {
        private String topping;
        private String size;
        private String dough;
        private String sauce;

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "topping='" + topping + '\'' +
                ", size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
