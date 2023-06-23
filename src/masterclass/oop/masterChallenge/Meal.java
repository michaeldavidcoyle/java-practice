package masterclass.oop.masterChallenge;

public class Meal {
    private Burger burger;
    private Side side;
    private Drink drink;

    public Meal() {
        burger = new Burger("Bill Burger", 7.95);
        side = new Side("fries", "medium", 3.25);
        drink = new Drink("soda", "medium", 2.75);
    }
}
