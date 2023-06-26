package masterclass.oop.masterChallenge;

public class BillsBurgers {
    public static void main(String[] args) {
        Meal billsCombo = new Meal();
        billsCombo.printOrder();
        System.out.println();
//
//        Meal customMeal = new Meal();
//        customMeal.getBurger().customize("patty", "add");
//        customMeal.getBurger().customize("cheese", "add");
//        customMeal.getBurger().customize("bacon", "add");
//        customMeal.getBurger().customize("lettuce", "hold");
//        customMeal.getBurger().customize("onion", "extra");
//        customMeal.getBurger().customize("jalepeno", "extra");
//        customMeal.getDrink().setSize("large");
//        customMeal.getSide().setSize("large");
//        customMeal.printOrder();
//        System.out.println("-".repeat(24));

//        Meal deluxeMeal = new Meal(new DeluxeBurger());
//        deluxeMeal.getBurger().customize("lettuce", "light");
//
//        deluxeMeal.getBurger().customize("jalepeno", "add");
//        deluxeMeal.printOrder();

        Burger burger = new Burger("bill's", 6.95);
        burger.addToppings("bacon");
        burger.addToppings("cheese");
        MenuItem fries = new MenuItem("side", "fries", 2.95);
        MenuItem soda = new MenuItem("drink", "dr pepper", 2.5);
        burger.customize(burger.getMayo(), "light");
        burger.printItem();
        fries.printItem();
        soda.printItem();
    }
}
