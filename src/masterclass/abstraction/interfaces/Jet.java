package masterclass.abstraction.interfaces;

public class Jet implements FlightEnabled, Trackable {
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
