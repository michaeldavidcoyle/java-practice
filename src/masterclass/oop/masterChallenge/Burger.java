package masterclass.oop.masterChallenge;

public class Burger {
    private String type;
    private double basePrice;
    private StringBuilder toppings;

    protected final static double costPerExtraPatty = 2.5;
    protected final static double costPerCheeseSlice = 0.5;
    protected final static double costPerBacon = 0.75;

    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        this.toppings = new StringBuilder("mayo, mustard, lettuce, tomato, onion");
    }

    public void customize(String item, String level) {
        int itemIndex = toppings.indexOf(item);
        if (itemIndex < 0) {
            toppings.append(String.format(", %s %s", level, item));
            return;
        }
        toppings.insert(toppings.indexOf(item) - 1, level + " ");
    }

    public double calculateTotal(int extraPatties, int cheeseSlices, int baconSlices) {
        double extras = (costPerExtraPatty * extraPatties) +
                (costPerCheeseSlice * cheeseSlices) +
                (costPerBacon * baconSlices);
        return basePrice + extras;
    }

    public void printOrder() {
        System.out.printf("%s with %s: $%.2f%n", type, toppings, basePrice);
        System.out.printf("Total: $%.2f%n", calculateTotal(0, 0, 0));
    }
}