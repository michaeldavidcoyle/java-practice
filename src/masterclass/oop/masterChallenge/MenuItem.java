package masterclass.oop.masterChallenge;

public class MenuItem {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

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
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }
}
