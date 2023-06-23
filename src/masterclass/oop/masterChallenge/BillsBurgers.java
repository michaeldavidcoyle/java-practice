package masterclass.oop.masterChallenge;

public class BillsBurgers {
    protected static double single = 5.95;
    protected static double deluxe = 6.95;
    protected static double combo = 8.95;
    protected static double smallFries = 1.95;
    protected static double mediumFries = 2.75;
    protected static double largeFries = 3.45;
    protected static double tea = 1.95;
    protected static double soda = 2.45;
    protected static double lemonade = 2.95;

    public static void main(String[] args) {
        Meal billsCombo = new Meal();
        billsCombo.printOrder();
        System.out.println("-".repeat(24));

        Meal customMeal = new Meal();
        customMeal.getBurger().customize("patty", "add");
        customMeal.getBurger().customize("cheese", "add");
        customMeal.getBurger().customize("bacon", "add");
        customMeal.getBurger().customize("lettuce", "hold");
        customMeal.getBurger().customize("onion", "extra");
        customMeal.getBurger().customize("jalepeno", "extra");
        customMeal.getDrink().setSize("large");
        customMeal.getSide().setSize("large");
        customMeal.printOrder();
        System.out.println("-".repeat(24));

        Meal deluxeMeal = new Meal(new DeluxeBurger());
        deluxeMeal.getBurger().customize("jalepeno", "add");
        deluxeMeal.printOrder();
    }
}
