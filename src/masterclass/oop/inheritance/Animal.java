package masterclass.oop.inheritance;

// inheritance
// code reuse, a way to organize chasses into parent-child hierarchy
// which lets the child derive fields and methods from its parent
// a class can have multiple subclasses, but a class can only ever have one parent
// a class will inherit from its parent and a parent's parent

public class Animal {
    protected String type; // protected allows use by subclass
    private String size;
    private double weight;

    public Animal() {
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed + '.');
    }

    public void makeNoise() {
        System.out.println(type + " makes an animal noise.");
    }
}
