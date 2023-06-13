package canvas;// constructor chaining
//     * every class in Java inherits from java.lang.Object
//     * w/o defining a superclass, extends Object is implied
//     * the first line of a constructor must be a call to super or this
//     * calling constructor causes a chain of constructors to fire

public class Chaining {
    public static void main(String[] args) {
//        JavaDeveloper developer = new JavaDeveloper();
        JavaDeveloper javaDeveloper = new JavaDeveloper("Java");
    }
}

class Employee {
    String name = "Bob Robertson";
    public Employee() {
        System.out.println("Employee");
    }
}

class JavaDeveloper extends Employee {
    String language;

    public JavaDeveloper() {
        // super() call implied to ensure the name variable is defined
        System.out.println(name + ", Java Developer");
    }

    public JavaDeveloper(String language) {
        this(); // calls no-argument constructor, printing out name + ", Java Developer"
        this.language = language;
        System.out.println(language);
    }
}
