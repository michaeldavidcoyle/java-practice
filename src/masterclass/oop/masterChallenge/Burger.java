package masterclass.oop.masterChallenge;

public class Burger extends MenuItem {
    private MenuItem mayo = new MenuItem("TOPPING", "MAYO", 0d);
    private MenuItem mustard = new MenuItem("TOPPING", "MUSTARD", 0d);
    private MenuItem lettuce = new MenuItem("TOPPING", "LETTUCE", 0d);
    private MenuItem tomato = new MenuItem("TOPPING", "TOMATO", 0d);
    private MenuItem onion = new MenuItem("TOPPING", "ONION", 0d);
    private MenuItem extraTopping1;
    private MenuItem extraTopping2;
    private MenuItem extraTopping3;

    protected static double costPerExtraPatty = 2.75;
    protected static double costPerCheeseSlice = 0.65;
    protected static double costPerBacon = 1.25;
    protected static double costPerEgg = 0.75;
    protected static double costPerAvocado = 1.75;
    protected static double costPerJalepeno = 0.55;

    public Burger(String name, double price) {
        super("BURGER", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public void printItem() {
        super.printItem();
        if (getName().contains("BURGER")) {
            if (extraTopping1 != null) extraTopping1.printItem();
            if (extraTopping2 != null) extraTopping2.printItem();
            if (extraTopping3 != null) extraTopping3.printItem();
            if (!mayo.getSize().equals("MEDIUM")) mayo.printItem();
            if (!mustard.getSize().equals("MEDIUM")) mustard.printItem();
            if (!lettuce.getSize().equals("MEDIUM")) lettuce.printItem();
            if (!tomato.getSize().equals("MEDIUM")) tomato.printItem();
            if (!onion.getSize().equals("MEDIUM")) onion.printItem();
        }
    }

    public void addToppings(String topping) {
        if (extraTopping1 == null) {
            extraTopping1 = new MenuItem("ADDED TOPPING", "+ " + topping, addedCharge(topping));
        } else if (extraTopping2 == null) {
            extraTopping2 = new MenuItem("ADDED TOPPING", "+ " + topping, addedCharge(topping));
        } else if (extraTopping3 == null) {
            extraTopping3 = new MenuItem("ADDED TOPPING", "+ " + topping, addedCharge(topping));
        }
    }

    public void addToppings(String topping1, String topping2, String topping3) {
        extraTopping1 = new MenuItem("ADDED TOPPING", "+ " + topping1, addedCharge(topping1));
        extraTopping2 = new MenuItem("ADDED TOPPING", "+ " + topping2, addedCharge(topping2));
        extraTopping3 = new MenuItem("ADDED TOPPING", "+ " + topping3, addedCharge(topping3));
    }

    protected double addedCharge(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "PATTY" -> costPerExtraPatty;
            case "CHEESE" -> costPerCheeseSlice;
            case "BACON" -> costPerBacon;
            case "EGG" -> costPerEgg;
            case "AVOCADO" -> costPerAvocado;
            case "JALEPENO" -> costPerJalepeno;
            default -> 0d;
        };
    }

    public void customize(MenuItem item, String level) {
        item.setType("CUSTOM");
        item.setSize(level);
    }

    public MenuItem getMayo() {
        return mayo;
    }

    public MenuItem getMustard() {
        return mustard;
    }

    public MenuItem getLettuce() {
        return lettuce;
    }

    public MenuItem getTomato() {
        return tomato;
    }

    public MenuItem getOnion() {
        return onion;
    }
}