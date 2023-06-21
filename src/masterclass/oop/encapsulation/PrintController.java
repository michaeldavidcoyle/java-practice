package masterclass.oop.encapsulation;

public class PrintController {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        Printer duplexPrinter = new Printer(100, true);

        int toner = 60;
        int tonerLevel = printer.addToner(toner);
        System.out.printf("Toner level: %d%%, attempting to add %d%%%n", printer.getTonerLevel(), toner);
        if (tonerLevel >= 0) {
            System.out.printf("Adding %d%%%n", toner);
            System.out.printf("Toner level: %d%%%n", printer.getTonerLevel());
        } else {
            System.out.println("Too much toner.");
        }
        System.out.println("-".repeat(24));

        toner = 45;
        tonerLevel = printer.addToner(toner);
        System.out.printf("Toner level: %d%%, attempting to add %d%%%n", printer.getTonerLevel(), toner);
        if (tonerLevel >= 0) {
            System.out.printf("Adding %d%%%n", toner);
            System.out.printf("Toner level: %d%%%n", printer.getTonerLevel());
        } else {
            System.out.println("Too much toner.");
        }
        System.out.println("-".repeat(24));

        int pages1 = 11;
        int pages2 = 8;

        System.out.printf("Printing %d pages.%n", printer.printPages(pages1));
        System.out.printf("Printing %d pages.%n", printer.printPages(pages2));
        System.out.printf("Total pages printed: %d%n", printer.getPagesPrinted());
        System.out.println("-".repeat(24));

        System.out.printf("Printing %d pages.%n", duplexPrinter.printPages(pages1));
        System.out.printf("Printing %d pages.%n", duplexPrinter.printPages(pages2));
        System.out.println("Total pages printed: " + duplexPrinter.getPagesPrinted());
    }
}
