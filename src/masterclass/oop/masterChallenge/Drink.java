package masterclass.oop.masterChallenge;

public class Drink {
    private String type;
    private String size;
    private double price;
    private boolean refillable;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
        refillable = type.equals("tea") || type.equals("soda");
    }

    public void printOrder() {
        System.out.printf("%s %s.....$%.2f%n", size, type, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ( !(size.equals("small") || size.equals("medium") || size.equals("large")) ) return;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) return;
        this.price = price;
    }
}
