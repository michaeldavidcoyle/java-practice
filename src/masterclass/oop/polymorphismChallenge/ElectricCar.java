package masterclass.oop.polymorphismChallenge;

public class ElectricCar extends Car {
    private double averageMilesPerCharge;
    private int batterySize;

    public ElectricCar(String description, double averageMilesPerCharge, int batterySize) {
        super(description);
        this.averageMilesPerCharge = averageMilesPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf(
                " with the push of a button, quietly engaging the %d kWh battery.%n",
                batterySize
        );
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf(", and enjoying the %.0f miles per charge.%n", averageMilesPerCharge);
    }

    public double getAverageMilesPerCharge() {
        return averageMilesPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
