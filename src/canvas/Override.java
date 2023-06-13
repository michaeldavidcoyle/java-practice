package canvas;// method overriding
// allows a subclass or child class to provide a specific implementation of a method that is already
// provided by one of its superclasses or parent classes

public class Override {
    public static void main(String[] args) {
        Poppable poppable = new Poppable();
        poppable.pop(); // pop

        Poppable balloon = new Balloon();
        Balloon balloon2 = new Balloon();
        balloon.pop(); // POP!
        balloon2.pop(4);

        Poppable bubble = new Bubble();
        bubble.pop(); // blup
    }
}

class Poppable {
    public void pop() {
        System.out.println("pop");
    }
}

class Balloon extends Poppable {
    // method overriding: same signature, method name and parameters, as superclass
    public void pop() {
        System.out.println("POP!");
    }

    public void pop(int n) { // NOT method overriding, signature does not match. Rather, method overloading
        for (int i = 0; i < n; i++) {
            System.out.print("pop ");
        }
        System.out.println();
    }
}

class Bubble extends Poppable {
    // method overriding: same signature, method name and parameters, as superclass
    public void pop() {
        System.out.println("blup");
    }
}