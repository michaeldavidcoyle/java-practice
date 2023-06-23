package masterclass.oop.masterChallenge;

public class Side {
    private String type;
    private String size;
    private double price;

    public Side(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
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
