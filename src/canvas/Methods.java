package canvas;// method declaration:
// public void go(int x, String y) {}
// "public" keyword is an canvas.access modifier
// "void" is the return type, in this case meaning the method will not return anything
// "go" is the method name
// in parentheses are the parameters
// method name and parameters together are called the method signature

// method invocation:
// object.go(10, "A");
// "object" is the object reference variable
// "go", the method name again
// in parentheses is the argument list (based on data types specified in parameter list)

public class Methods {
    public static void main(String[] args) {
        // instantiating an object from the Methods class
        Methods example = new Methods();
        // invoking an instance method
        int returnValue = example.go();

        // calling static method
        int value = Methods.go(42);
    }

    // instance method, must be called from an object instantiated from the class
    public int go() {
        return 11;
    }

    // static method, called on the class itself
    public static int go(int x) {
        return x;
    }
}
