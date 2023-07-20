package masterclass.abstraction.interfaces;

// While a class may only extend a single class, it can implement many interfaces, allowing plug and play functionality.
// In this case, a Bird may be described by what it is, an Animal and by what it does, FlightEnabled (able to fly)
public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println("flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " takes off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " lands");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flys");
    }

    @Override
    public void track() {
        System.out.println("recording " + getClass().getSimpleName() + "'s coordinates");
    }
}
