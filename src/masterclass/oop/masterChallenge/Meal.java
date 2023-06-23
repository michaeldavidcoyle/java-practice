package masterclass.oop.masterChallenge;

public class Meal {
    private Burger burger;
    private Side side;
    private Drink drink;

    public Meal() {
        burger = new Burger("Bill Burger",  5.95);
        side = new Side("fries", "medium", 2.75);
        drink = new Drink("soda", "medium", 2.45);
    }

    public void printOrder() {
        burger.printOrder();
        side.printOrder();
        drink.printOrder();
        System.out.println();

        double total = burger.total() + side.getPrice() + drink.getPrice();
        System.out.printf("Total.....$%.2f%n", total);
    }
}
