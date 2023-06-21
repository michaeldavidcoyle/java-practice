package masterclass.oop.compositionChallenge;

public class KitchenController {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, false, false);
        kitchen.doKitchenWork();
        System.out.println("-".repeat(24));

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
}
