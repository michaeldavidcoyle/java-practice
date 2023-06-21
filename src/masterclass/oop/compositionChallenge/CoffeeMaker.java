package masterclass.oop.compositionChallenge;

import masterclass.oop.compositionChallenge.Appliance;

public class CoffeeMaker extends Appliance {
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("Brewing coffee.");
            setHasWorkToDo(false);
        }
    }
}
