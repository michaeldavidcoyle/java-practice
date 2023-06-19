package masterclass.oop.inheritance;

import java.util.Objects;

// extends keyword specifies the parent or superclass of the class being declared
// it means Dog inherits from Animal, or that Dog "IS A" type of Animal
// Dog will inherit all of Animal's attributes and methods
// the extends clause may specify one and only one super class
public class Dog extends Animal {
    // Dog implicitly inherits all attributes from Animal
    // attributes specific to Dog
    private String earShape;
    private String tailShape;

    public Dog() {
        // calls constructor of the super class
        // must be first statement (because of this rule, this() and super() can never be called form the same constructor)
        // without an explicit call to super(), Java will call it implicitly, using super's default constructor
        // if super does not have a default constructor, super() must be explicitly called, passing appropriate arguments
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(
            type,
            weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
            weight
        );
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                // here keyword super is similar to this but for parent class
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.print("Owwooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail.");
        if (Objects.equals(speed, "slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog running ");
    }

    private void walk() {
        System.out.print("Dog walking ");
    }

    private void wagTail() {
        System.out.print("Tail wagging ");
    }
}
