package masterclass.oop.inheritance;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, weight < 10 ? "small" : "large", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("fish wiggles ");
    }

    private void moveBackFin() {
        System.out.print("backfin swishes ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed.equals("fast")) {
            moveBackFin();
        }
        System.out.println();
    }
}
