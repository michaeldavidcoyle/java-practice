package masterclass.oop.masterChallenge;

public class Meal {
    private Burger burger;
    private MenuItem side;
    private MenuItem drink;

    public Meal() {
        burger = new Burger("Bill's",  MenuItem.single);
        side = new MenuItem("SIDE", "FRIES", MenuItem.mediumFries);
        drink = new MenuItem("DRINK", "SODA", MenuItem.soda);
    }

    public Meal(Burger burger) {
        this.burger = burger;
        side = new MenuItem("SIDE", "FRIES", MenuItem.mediumFries);
        drink = new MenuItem("DRINK", "SODA", MenuItem.soda);
    }

    public void printOrder() {
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(32));

        double total = burger.getAdjustedPrice() + side.getAdjustedPrice() + drink.getAdjustedPrice();
        MenuItem.printItem("TOTAL", total);
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public MenuItem getSide() {
        return side;
    }

    public void setSide(MenuItem side) {
        this.side = side;
    }

    public MenuItem getDrink() {
        return drink;
    }

    public void setDrink(MenuItem drink) {
        this.drink = drink;
    }
}
