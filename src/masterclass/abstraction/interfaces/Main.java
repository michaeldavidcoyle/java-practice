package masterclass.abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        // same bird object may be assigned to any of these types
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        // compile error because these types do not have move method
//        flier.move();
//        tracked.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
