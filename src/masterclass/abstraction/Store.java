package masterclass.abstraction;

import java.util.ArrayList;
import java.util.List;

// Abstract class challenge
public class Store {
    // manage a list of products for sale, including displaying product details
    // manage an order, a list of OrderItem objects
    // have methods to add an item to order and print ordered items as a sales receipt
    private static ArrayList<ProductForSale> products = new ArrayList<>(
            List.of(
                    new Widget(19.95),
                    new Thneed(),
                    new ThingamaJig(29.99)
            )
    );

    private static void listProducts() {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    private static void addOrderItem(ArrayList<OrderItem> order, String type, int quantity) {
        int productIndex = switch(type.toUpperCase()) {
            case "WIDGET" -> 0;
            case "THNEED" -> 1;
            default -> 2;
        };
        order.add(new OrderItem(quantity, products.get(productIndex)));
    }

    private static void printReceipt(ArrayList<OrderItem> order) {
        double total = 0d;
        System.out.println("Sales Receipt: ");
        for (OrderItem item : order) {
            ProductForSale product = item.product();
            product.printPriceLineItem(item.quantity());
            total += product.salesPrice(item.quantity());
        }
        String amount = String.format("$%.2f", total);
        System.out.println("-".repeat(32));
        System.out.printf("Total%s%s%n", " ".repeat(26 - amount.length()), amount);
        System.out.println();
    }

    public static void main(String[] args) {
        listProducts();

        ArrayList<OrderItem> order1 = new ArrayList<>();
        addOrderItem(order1,"widget", 4);
        addOrderItem(order1,"thneed", 5);
        addOrderItem(order1,"thingamajig", 2);
        printReceipt(order1);

        ArrayList<OrderItem> order2 = new ArrayList<>();
        addOrderItem(order2,"widget", 10);
        addOrderItem(order2,"thneed", 4);
        printReceipt(order2);
    }
}


// create ProductForSale class
//     + fields:
//         * type
//         * price
//         * description
//    + methods
//         * salesPrice -> quantity * price
//         * printPriceLineItem -> takes in quantity and prints quantity and line item price
//         * showDetails => abstract method displaying product type, description, price, etc.

// create OrderItem type
//     + fields
//         * quantity
//         * productForSale

// create 2-3 classes extending ProductForSale