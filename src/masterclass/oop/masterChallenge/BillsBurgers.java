package masterclass.oop.masterChallenge;

public class BillsBurgers {
    public static void main(String[] args) {
        Meal billsCombo = new Meal();
        billsCombo.addBurgerToppings("bacon");
        billsCombo.addBurgerToppings("cheese");
        billsCombo.customizeBurger(billsCombo.getBurger().getLettuce(), "light");
        billsCombo.printOrder();
        System.out.println();
    }
}
