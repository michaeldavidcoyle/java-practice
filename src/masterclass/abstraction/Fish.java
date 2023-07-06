package masterclass.abstraction;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.printf("%s lazily swimming%n", getExplicitType());
        } else {
            System.out.printf("%s darting frantically%n", getExplicitType());
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Goldfish")) {
            System.out.print("swish ");
        } else {
            System.out.print("splash ");
        }
    }
}
