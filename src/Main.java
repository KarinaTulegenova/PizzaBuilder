public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = new Pizza.Builder()
                .setTopping("Pepperoni")
                .setSize("Large")
                .setDough("Thick")
                .setSauce("Tomato sauce")
                .build();

        Pizza margarita = new Pizza.Builder()
                .setTopping("Mozzarella")
                .setSize("Medium")
                .setDough("Thin")
                .setSauce("Tomato sauce")
                .build();

        Pizza pesto_pizza = new Pizza.Builder()
                .setTopping("Olive")
                .setSize("Small")
                .setDough("Thin")
                .setSauce("Pesto")
                .build();

        System.out.println(pepperoni);
        System.out.println(margarita);
        System.out.println(pesto_pizza);
    }
}
