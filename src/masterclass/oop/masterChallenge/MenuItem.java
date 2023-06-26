package masterclass.oop.masterChallenge;

public class MenuItem {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    protected static double single = 5.95;
    protected static double deluxe = 6.95;
    protected static double mediumFries = 2.75;
    protected static double tea = 1.95;
    protected static double soda = 2.45;
    protected static double lemonade = 3.49;

    public MenuItem(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public static void printItem(String name, double price) {
        int width = 32;
        String formattedPrice = String.format("$%4.2f", price);
        String padding = ".".repeat(width - name.length() - formattedPrice.length());

        System.out.println(name + padding + formattedPrice);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    public double getAdjustedPrice() {
        return switch(size) {
          case "SMALL" -> getBasePrice() - 0.5;
          case "LARGE" -> getBasePrice() + 0.75;
          default -> getBasePrice();
        };
    }

    public String getName() {
        if (type.equals("CUSTOM") || type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public void setType(String type) {
        this.type = type;
    }
}
