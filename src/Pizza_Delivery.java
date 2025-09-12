public class Pizza_Delivery {

    public static Pizza createPepperoniPizza() {
        return new Pizza.Builder()
                .withTopping("Pepperoni")
                .withSize("Large")
                .withDough("Thick")
                .withSauce("Tomato sauce")
                .withCheeseType("Mozzarella")
                .withCrustType("Cheese-stuffed")
                .build();
    }

    public static Pizza createMargaritaPizza() {
        return new Pizza.Builder()
                .withTopping("Mozzarella")
                .withSize("Medium")
                .withDough("Thin")
                .withSauce("Tomato sauce")
                .withCheeseType("Cheddar")
                .withCrustType("Classic")
                .build();
    }
}
