package masterclass.oop.masterChallenge;

public class Burger {
    private String type;
    private double basePrice;
    private int extraPatties;
    private int cheeseSlices;
    private int baconSlices;
    private int avocadoPortions;
    private int jalepenoPortions;
    private String mayo = "mayo";
    private String mustard = "mustard";
    private String lettuce = "lettuce";
    private String tomato = "tomato";
    private String onion = "onion";
    private String pickle = "";
    private String customTopping = "";

    protected static double costPerExtraPatty = 2.75;
    protected static double costPerCheeseSlice = 0.65;
    protected static double costPerBacon = 0.90;
    protected static double costPerAvocado = 1.75;
    protected static double costPerJalepeno = 0.75;

    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public void customize(String item, String level) {
        boolean extra = level.equals("extra");
        switch (item) {
            case "patty" -> extraPatties = extra ? 2 : 1;
            case "cheese" -> cheeseSlices = extra ? 2 : 1;
            case "bacon" -> baconSlices = extra ? 6 : 3;
            case "avocado" -> avocadoPortions = extra ? 2 : 1;
            case "jalepeno" -> jalepenoPortions = extra ? 2 : 1;
            case "mayo" -> mayo = extra ? "extra mayo" : "";
            case "mustard" -> mustard = extra ? "extra mustard" : "";
            case "lettuce" -> lettuce = extra ? "extra lettuce" : "";
            case "tomato" -> tomato = extra ? "extra tomato" : "";
            case "onion" -> onion = extra ? "extra onion" : "";
            case "pickle" -> pickle = extra ? "extra pickle" : "pickle";
            default -> customTopping = extra ? ("extra " + item) : item;
        }
    }

    public String toppings() {
        String patty = extraPatties > 0 ? String.format("%dx patty.....$%.2f%n", extraPatties, addCharge("patty") * extraPatties) : "";
        String cheese = cheeseSlices > 0 ? String.format("%dx cheese.....$%.2f%n", cheeseSlices, addCharge("cheese") * cheeseSlices) : "";
        String bacon = baconSlices > 0 ? String.format("%dx bacon.....$%.2f%n", baconSlices, addCharge("bacon") * baconSlices) : "";
        String avocado = avocadoPortions > 0 ? String.format("%dx avocado.....%.2f%n", avocadoPortions, addCharge("avocado") * avocadoPortions) : "";
        String jalepeno = jalepenoPortions > 0 ? String.format("%dx jalepeno.....%.2f%n", jalepenoPortions, addCharge("jalepeno") * jalepenoPortions) : "";
        String mayo = this.mayo.isEmpty() ? "" : String.format("%s.....$0.00%n", this.mayo);
        String mustard = this.mustard.isEmpty() ? "" : String.format("%s.....$0.00%n", this.mustard);
        String lettuce = this.lettuce.isEmpty() ? "" : String.format("%s.....$0.00%n", this.lettuce);
        String tomato = this.tomato.isEmpty() ? "" : String.format("%s.....$0.00%n", this.tomato);
        String onion = this.onion.isEmpty() ? "" : String.format("%s.....$0.00%n", this.onion);
        String pickle = this.pickle.isEmpty() ? "" : String.format("%s.....$0.00%n", this.pickle);
        String custom = this.customTopping.isEmpty() ? "" : String.format("%s.....$0.00%n", this.customTopping);

        return patty + cheese + bacon + avocado + jalepeno + mayo + mustard + lettuce + tomato + onion + pickle + custom;
    }

    public double total() {
        double extras = addCharge("patty") +
                addCharge("cheese") +
                addCharge("bacon") +
                addCharge("avocado") +
                addCharge("jalepeno");
        return basePrice + extras;
    }

    private double addCharge(String item) {
        return switch (item) {
            case "patty" -> costPerExtraPatty * extraPatties;
            case "cheese" -> costPerCheeseSlice * cheeseSlices;
            case "bacon" -> costPerBacon * baconSlices;
            case "avocado" -> costPerAvocado * avocadoPortions;
            case "jalepeno" -> costPerJalepeno * jalepenoPortions;
            default -> 0d;
        };
    }

    public void printOrder() {
        System.out.printf("%s.....$%.2f%n%s%n", type, basePrice, toppings());
//        System.out.printf("Subtotal: $%.2f%n", total());
    }
}