package masterclass.oop.polymorphismChallenge;

public class GasPoweredCar extends Car {
    private double averageMPG;
    private int cylinders;

    public GasPoweredCar(String description, double averageMPG, int cylinders) {
        super(description);
        this.averageMPG = averageMPG;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf(
                " with a turn of the key and the VROOM of all %d cylinders.%n",
                cylinders
        );
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf(", and enjoying the %.0f MPG%n", averageMPG);
    }

    public double getAverageMPG() {
        return averageMPG;
    }

    public int getCylinders() {
        return cylinders;
    }
}
