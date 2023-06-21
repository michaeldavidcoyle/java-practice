package masterclass.oop.compositionChallenge;

import masterclass.oop.compositionChallenge.Appliance;

public class DishWasher extends Appliance {
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes() {
        if (isHasWorkToDo()) {
            System.out.println("Washing dishes.");
            setHasWorkToDo(false);
        }
    }
}
