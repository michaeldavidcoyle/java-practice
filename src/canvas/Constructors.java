package canvas;

// constructors initialize an object's state
// calling the constructor creates an object at runtime (new keyword)
// if no constructor is present, Java provides default no argument constructor
// can define multiple constructors (constructor overloading)
public class Constructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.slices = 8;
        pizza.eat();

        Pizza pie = new Pizza(8);
        pie.topping = "pepperoni";

        Pizza meatLovers = new Pizza(8, "all the meats");

        System.out.println(pizza.slices);
        System.out.println(pie.slices);
        System.out.println(meatLovers.topping);
    }
}

class Pizza {
    int slices;
    String topping;

    Pizza() {} // must be explicitly defined once another constructor is defined

    Pizza(int pieces) {
        slices = pieces;
    }

    Pizza(int pieces, String top) {
        slices = pieces;
        topping = top;
    }

    public void eat() {
        slices -= 1;
    }
}
