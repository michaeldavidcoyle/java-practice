package canvas;// scopes:
//    * class variables (static)
//         - declared in class body w/ static modifier
//         - no object instantiation required
//         - shared by all class member objects
//    * instance variables
//         - declared in class body
//         - each object has its own
//         - marked for garbage collect when no longer referenced
//    * local variables
//         - declared in method body or as method parameter
//         - only available inside the method
//    * block-scope variables
//         - declared within a block of code:
//              + if statements
//              + loops
//              + try/catch blocks
//         - only accessible within the block
//         - marked for garbage collect after black ends

// variable scope affects visibility and lifespan

public class Scopes {
    public static void main(String[] args) {
        Person bob = new Person();
        Person sally = new Person();

        bob.age = 42;
        sally.age = 36;

        // AVOID, set and/or reference static variables using the class, not an instance object
//        bob.planet = "Earth";
//        System.out.println(sally.planet); // Earth
        // proper way
        Person.planet = "Earth";
        System.out.println(Person.planet); // Earth
    }
}

class Person {
    int age; // instance variable
    static String planet; // class (static) variable

    public void move(int distance) { // local variable
        {
            // block-scope variable
            int x = 10;
            distance = 10;
        }
//         x = 9; // will not compile
        distance += 10;
    }
}
