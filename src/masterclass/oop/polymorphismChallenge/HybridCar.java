package masterclass.oop.polymorphismChallenge;

public class HybridCar extends Car {
    private double averageMPG;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double averageMPG, int batterySize, int cylinders) {
        super(description);
        this.averageMPG = averageMPG;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf(
                " quietly engaging the %d volt battery.%n",
                batterySize
        );
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf(", and enjoying the %.0f MPG.%n", averageMPG);
    }

    public double getAverageMPG() {
        return averageMPG;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
