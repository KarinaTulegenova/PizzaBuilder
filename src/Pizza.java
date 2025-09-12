public class Pizza {

    private final String topping;
    private final String size;
    private final String dough;
    private final String sauce;
    private final String cheeseType;
    private final String crustType;

    private Pizza(Builder builder) {
        this.topping = builder.topping;
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheeseType = builder.cheeseType;
        this.crustType = builder.crustType;
    }

    public static class Builder {
        private String topping;
        private String size;
        private String dough;
        private String sauce;
        private String cheeseType;
        private String crustType;

        public Builder withTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder withSize(String size) {
            this.size = size;
            return this;
        }

        public Builder withDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder withCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public Builder withCrustType(String crustType) {
            this.crustType = crustType;
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
                ", cheeseType='" + cheeseType + '\'' +
                ", crustType='" + crustType + '\'' +
                '}';
    }
}
