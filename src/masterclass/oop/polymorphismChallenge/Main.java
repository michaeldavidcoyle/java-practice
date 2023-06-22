package masterclass.oop.polymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2015 Honda Accord");
        testDrive(car);

        Car gasolineCar = new GasPoweredCar(
                "2015 Ford Explorer", 25, 6
        );
        testDrive(gasolineCar);

        Car tesla = new ElectricCar(
                "2023 Tesla Model S", 396, 100
        );
        testDrive(tesla);

        Car prius = new HybridCar(
                "2023 Toyota Prius", 56, 12, 4
        );
        testDrive(prius);
    }

    public static void testDrive(Car car) {
        String category = car.getClass().getSimpleName();
        car.startEngine();
        if (category.equals("Car")) System.out.println();
        car.runEngine();
        if (category.equals("Car")) System.out.println();
        car.drive();
        if (category.equals("Car")) System.out.println();
        System.out.println("-".repeat(24));
    }
}
