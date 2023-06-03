package access;

public class Computer {
    // protected access modifier restricts this method to classes within the same package
    protected void code() {
        System.out.println("while (alive) { learn(); }");
    }
}
