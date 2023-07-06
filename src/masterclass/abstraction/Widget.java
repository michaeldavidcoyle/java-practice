package masterclass.abstraction;

public class Widget extends ProductForSale {
    public Widget(double price) {
        super("Widget", price, "It's a ficitonal product. It doesn't matter.");
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(description);
        System.out.printf("$%.2f%n", price);
    }
}
