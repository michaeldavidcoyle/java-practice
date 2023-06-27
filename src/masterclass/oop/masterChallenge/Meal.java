package masterclass.oop.masterChallenge;

public class Meal {
    private Burger burger;
    private MenuItem side;
    private MenuItem drink;

    public Meal() {
        this("Bill's",  "fries", "soda");
    }

    public Meal(String burgerType, String sideType, String drinkType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger("DELUXE", MenuItem.deluxeCombo);
        } else {
            this.burger = new Burger(burgerType, MenuItem.single);
        }
        side = new MenuItem("SIDE", sideType, MenuItem.mediumFries);
        double drinkPrice = switch (drinkType.toUpperCase()) {
            case "TEA", "UNSWEET TEA", "SWEET TEA" -> MenuItem.tea;
            case "LEMONADE" -> MenuItem.lemonade;
            default -> MenuItem.soda;
        };
        drink = new MenuItem("DRINK", drinkType, drinkPrice);
    }

    public double getTotal() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }

        return burger.getAdjustedPrice() +
                burger.getExtraCost() +
                side.getAdjustedPrice() +
                drink.getAdjustedPrice();
    }

    public void printOrder() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            MenuItem.printItem(side.getName(), 0d);
            MenuItem.printItem(drink.getName(), 0d);
        } else {
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(32));
        MenuItem.printItem("TOTAL", getTotal());
    }

    public void addBurgerToppings(String topping) {
        burger.addToppings(topping);
    }

    public void addBurgerToppings(String topping1, String topping2, String topping3) {
        burger.addToppings(topping1, topping2, topping3);
    }

    public void addBurgerToppings(
            String topping1,
            String topping2,
            String topping3,
            String topping4,
            String topping5
    ) {
        if (burger instanceof DeluxeBurger deluxeBurger) {
            deluxeBurger.addToppings(topping1, topping2, topping3, topping4, topping5);
        } else {
            burger.addToppings(topping1, topping2, topping3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void customizeBurger(String itemName, String level) {
        MenuItem item = switch (itemName.toUpperCase()) {
            case "MAYO" -> burger.getMayo();
            case "MUSTARD" -> burger.getMustard();
            case "LETTUCE" -> burger.getLettuce();
            case "TOMATO" -> burger.getTomato();
            case "ONION" -> burger.getOnion();
            default -> null;
        };
        burger.customize(item, level);
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public MenuItem getSide() {
        return side;
    }

    public void setSide(MenuItem side) {
        this.side = side;
    }

    public MenuItem getDrink() {
        return drink;
    }

    public void setDrink(MenuItem drink) {
        this.drink = drink;
    }
}
