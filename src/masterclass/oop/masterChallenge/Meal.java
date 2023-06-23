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

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
