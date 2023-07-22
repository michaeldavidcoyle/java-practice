package masterclass.abstraction.interfaces;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println("recording " + getClass().getSimpleName() + "'s coordinates");
    }
}
