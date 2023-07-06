package masterclass.abstraction;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double salesPrice(int quantity) {
        return quantity * price;
    }

    public void printPriceLineItem(int quantity) {
        int width = 30;
        String multiplier = String.format("x %d", quantity);
        String total = String.format("$%.2f", salesPrice(quantity));
        String pad = " ".repeat(width - type.length() - multiplier.length() - total.length());
        System.out.printf("%s %s%s%s%n", type, multiplier, pad, total);
    }

    public abstract void showDetails();
}
