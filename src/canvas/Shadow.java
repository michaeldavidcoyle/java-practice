package canvas;

public class Shadow {
    public static void main(String[] args) {
        Child child = new Child();
        int childX = child.getThisX(); // 5
        int parentX = child.getSuperX(); // 10

        System.out.printf("Child's x property value is %d%n", childX);
        System.out.printf("Parent's x property value is %d%n", parentX);
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 5;

    public int getThisX() {
        return this.x; // returns x declared within Child
    }

    public int getSuperX() {
        return super.x; // returns x declared on Parent
    }
}
