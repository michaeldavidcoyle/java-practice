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
        return burger.getAdjustedPrice() +
                burger.getExtraCost() +
                side.getAdjustedPrice() +
                drink.getAdjustedPrice();
    }

    public void printOrder() {
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(32));
        MenuItem.printItem("TOTAL", getTotal());
    }

    public void addBurgerToppings(String topping) {
        burger.addToppings(topping);
    }

    public void addBurgerToppings(String topping1, String topping2, String topping3) {
        burger.addToppings(topping1, topping2, topping3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void customizeBurger(MenuItem item, String level) {
        burger.customize(item, level);
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
