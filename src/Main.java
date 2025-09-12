public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = new Pizza.Builder()
                .withTopping("Pepperoni")
                .withSize("Large")
                .withDough("Thick")
                .withSauce("Tomato sauce")
                .withCheeseType("Mozzarella")
                .withCrustType("Cheese-stuffed")
                .build();

        Pizza margarita = new Pizza.Builder()
                .withTopping("Mozzarella")
                .withSize("Medium")
                .withDough("Thin")
                .withSauce("Tomato sauce")
                .withCheeseType("Cheddar")
                .withCrustType("Classic")
                .build();

        Pizza pesto_pizza = new Pizza.Builder()
                .withTopping("Olive")
                .withSize("Small")
                .withDough("Thin")
                .withSauce("Pesto")
                .withCheeseType("Goat cheese")
                .withCrustType("Thin crust")
                .build();

        System.out.println(pepperoni);
        System.out.println(margarita);
        System.out.println(pesto_pizza);
    }
}
