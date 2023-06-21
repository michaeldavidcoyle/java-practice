package masterclass.oop.compositionChallenge;

import masterclass.oop.compositionChallenge.Appliance;

public class Refrigerator extends Appliance {
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("Ordering food.");
            setHasWorkToDo(false);
        }
    }
}
