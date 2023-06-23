package masterclass.oop.masterChallenge;

public class Side {
    private double price;
    private String size;
    private String type;

    public Side(double price, String size, String type) {
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ( !(size.equals("small") || size.equals("medium") || size.equals("large")) ) return;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) return;
        this.price = price;
    }
}
