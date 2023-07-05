package masterclass.collections.lists;

public enum Topping {
    MAYO,
    MUSTARD,
    LETTUCE,
    TOMATO,
    ONION,
    PICKLES,
    CHEESE,
    BACON,
    AVOCADO,
    JALEPENO;

    public double getPrice() {
        return switch(this) {
            case CHEESE -> 0.9;
            case BACON -> 1.5;
            case AVOCADO -> 1.75;
            case JALEPENO -> 0.75;
            default -> 0d;
        };
    }
}
