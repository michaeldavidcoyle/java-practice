package masterclass.oop.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int adjustedLevel = tonerLevel + tonerAmount;
        if (adjustedLevel < 0 || adjustedLevel > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = pages;
        if (duplex) {
            jobPages = pages / 2 + 1;
            System.out.print("Duplex flex. ");
        }
        pagesPrinted += jobPages;

        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
