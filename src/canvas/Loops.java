package canvas;

public class Loops {
    public static void main(String[] args) {
        System.out.println("for loop:");
        forLoop(10);

        System.out.println("\nenhanced for loop:");
        enhancedForLoop(new int[] {1, 2, 3, 4, 5});

        System.out.println("\nwhile loop:");
        runWhile();

        System.out.println("\ndo while loop:");
//        doWhile(true); // infinite loop
        doWhile(false); // runs exactly once
    }

    static void forLoop(int max) {
        // counter variable; condition; increment
        for (int i = 0; i < max; i++) {
            System.out.print(i);
        }
    }

    static void enhancedForLoop(int[] integers) {
        for (int i: integers) {
            System.out.print(i);
        }
    }

    static void runWhile() {
        // infinite loop
//        boolean running = true;
//        while (running) {
//            System.out.println("running");
//        }
//
        boolean running = check();
        while (running) {
            System.out.println("running");
            running = check(); // allows for eventual exit from loop
        }
    }

    static boolean check() {
        return Math.random() < 0.5;
    }

    static void doWhile(boolean running) {
        do {
            System.out.println("running");
        } while(running);
    }
}
