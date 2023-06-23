package masterclass.oop.masterChallenge;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe Burger", BillsBurgers.deluxe);
        setDeluxe(true);
    }
}
