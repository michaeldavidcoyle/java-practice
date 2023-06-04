// abstraction
//    * building partial or incomplete classes
//    * create a foundation for other classes
//    * generalizations group shared functionality into a parent
//    * specializations extend them to further define behavior
//    * create classes w/o knowing how they're to be implemented
//    * abstract classes and interfaces
//        + partially built
//        + abstract methods do not need a body
//        + may have zero to many abstract methods
//        + no abstract methods unless class is declared abstract
//        + cannot be instantiated
//        + can extend other abstract classes

public class Abstraction {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // will not compile
    }
}

abstract class Shape {
    abstract double area(); // any class that extends shape must implement this method
}

class Triangle extends Shape {
    double base;
    double height;
    double area() { // required because class extends abstract Shape class
        return 0.5 * this.base * this.height;
    }
}

class Square extends Shape {
    double width;
    double area() { // required because class extends abstract Shape class
        return Math.pow(this.width, 2);
    }
}