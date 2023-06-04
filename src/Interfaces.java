import java.awt.*;

public class Interfaces {
    public static void main(String[] args) {

    }
}

interface Drawable {
    void draw(); // public and abstract are implied
}

interface Colorable extends Drawable { // interfaces can extend other interfaces
    void color();
}

class Rectangle implements Drawable {
    public void draw() {
        // draw!
        System.out.println("Drawing happy little trees.");
    }
}

class Circle implements Colorable { // must implement both color and draw methods
    public void color() {
        System.out.println("Happy coloring.");
    }
    public void draw() {
        System.out.println("Happy drawing.");
    }
}