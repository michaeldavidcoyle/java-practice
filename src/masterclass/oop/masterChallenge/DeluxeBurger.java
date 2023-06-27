package masterclass.oop.masterChallenge;

public class DeluxeBurger extends Burger {
    private MenuItem deluxe1;
    private MenuItem deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(
            String topping1,
            String topping2,
            String topping3,
            String topping4,
            String topping5
    ) {
        super.addToppings(topping1, topping2, topping3);
        deluxe1 = new MenuItem("TOPPING", "+ " + topping4, 0d);
        deluxe2 = new MenuItem("TOPPING", "+ " + topping5, 0d);
    }

    @Override
    protected double addedCharge(String toppingName) {
        return 0d;
    }

    @Override
    public void printItem() {
        super.printItem();
        if (deluxe1 != null) deluxe1.printItem();
        if (deluxe2 != null) deluxe2.printItem();
    }
}
