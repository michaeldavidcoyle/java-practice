package masterclass.oop.masterChallenge;

public class Meal {
    private Burger burger;
    private MenuItem side;
    private MenuItem drink;

    public Meal() {
        this("Bill's",  "fries", "soda");
    }

    public Meal(String burgerType, String sideType, String drinkType) {
        this.burger = new Burger(burgerType, MenuItem.single);
        side = new MenuItem("SIDE", "FRIES", MenuItem.mediumFries);
        drink = new MenuItem("DRINK", "SODA", MenuItem.soda);
    }

    public double getTotal() {
        return burger.getAdjustedPrice() + side.getAdjustedPrice() + drink.getAdjustedPrice();
    }

    public void printOrder() {
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(32));
        MenuItem.printItem("TOTAL", getTotal());
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
