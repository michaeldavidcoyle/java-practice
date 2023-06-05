// polymorphism
//    * the ability for objects to be used flexibly
//    * covariance and virtual method invocation
//        + how Java handles overridden methods
//    * covariance assignment must pass the "is-a" check
//        + Animal animal = new Dog(); // dog is a animal
//        + public void pet(Animal animal) {} // may be passed any animal type: dog, cat, cow, etc

public class Store {
    public static void main(String[] args) {
        Furniture chair = new Chair(); // reference type is Furniture but object type is Chair
        Furniture table = new Table(); // reference type is Furniture but object type is Table

        sell(chair); // Chair@129a8472
        sell(table); // Table@1b0375b3
    }

    public static void sell(Furniture furniture) { // accepts type Furniture and subclasses
        System.out.println(furniture);
    }
}

class Furniture {}

class Chair extends Furniture {}

class Table extends Furniture {}