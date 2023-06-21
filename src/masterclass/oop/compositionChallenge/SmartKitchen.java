package masterclass.oop.compositionChallenge;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker(false);
        dishWasher = new DishWasher(false);
        iceBox = new Refrigerator(false);
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(
            boolean brewMasterHasWork,
            boolean dishwasherHasWork,
            boolean iceBoxHasWork
    ) {
        brewMaster.setHasWorkToDo(brewMasterHasWork);
        dishWasher.setHasWorkToDo(dishwasherHasWork);
        iceBox.setHasWorkToDo(iceBoxHasWork);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
