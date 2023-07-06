package masterclass.abstraction;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.printf("%s walking%n", getExplicitType());
        } else {
            System.out.printf("%s running%n", getExplicitType());
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}
