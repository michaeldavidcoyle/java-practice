package masterclass.oop.masterChallenge;

public class BillsBurgers {
    public static void main(String[] args) {
        Meal billsCombo = new Meal();
        billsCombo.addBurgerToppings("bacon");
        billsCombo.addBurgerToppings("cheese");
        billsCombo.customizeBurger("lettuce", "light");
        billsCombo.printOrder();
        System.out.println();

        Meal meal = new Meal("bill's", "onion rings", "sweet tea");
        meal.addBurgerToppings("cheese");
        meal.setDrinkSize("large");
        meal.printOrder();
    }
}
