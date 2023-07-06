package masterclass.abstraction;

public class ThingamaJig extends ProductForSale {
    public ThingamaJig(double price) {
        super("ThingamaJig", price,
                "It's a thing. It's a jig. It's a thingamajig!");
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(description);
        System.out.printf("$%.2f%n", price);
    }
}
