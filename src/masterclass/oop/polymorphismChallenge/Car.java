package masterclass.oop.polymorphismChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    protected void runEngine() {
        String category = this.getClass().getSimpleName();
        String carSound = switch (category) {
            case "GasPoweredCar" -> "VROOM, VROOOOM!";
            case "ElectricCar" -> "Huuuuum.";
            case "HybridCar" -> "Prrrr.";
            default -> "Generic car noise.";
        };
        System.out.println(category + "'s engine sounds like: " + carSound);
    }

    public void startEngine() {
        System.out.printf("%s's engine starts", description);
    }

    public void drive() {
        System.out.printf("Driving my %s", description);
    }


    public String getDescription() {
        return description;
    }
}
