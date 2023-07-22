package masterclass.abstraction.interfaces;

/*
* Interfaces let us take object that may have almost nothing in common and write reusable code, so they may be processed
* in a like manner.
* Birds and Jets are different entities, but because they implement FlightEnabled they can be treated as the same type,
* as something that flies, and ignore the differences in the classes.
* Interfaces allow us to type our objects differently, by behavior only.
*/

public class Main {
    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

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

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);
    }
}
