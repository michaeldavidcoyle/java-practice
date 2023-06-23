package masterclass.oop.masterChallenge;

public class BillsBurgers {
    private static double single = 5.95;
    private static double combo = 8.95;
    private static double smallFries = 1.95;
    private static double mediumFries = 2.75;
    private static double largeFries = 3.45;
    private static double tea = 1.95;
    private static double soda = 2.45;
    private static double lemonade = 2.95;

    public static void main(String[] args) {
        Meal billsCombo = new Meal();
        billsCombo.printOrder();
    }
}
