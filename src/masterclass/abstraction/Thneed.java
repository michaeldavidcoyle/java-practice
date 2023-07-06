package masterclass.abstraction;

public class Thneed extends ProductForSale {
    public Thneed() {
        super("Thneed", 3.98, """
    A fine something that all people need.
    It's a shirt. It's a sock. It's a glove. It's a hat.
    But it has other uses, yes, far beyond that."""
        );
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(description);
        System.out.printf("$%.2f%n", price);
    }
}
