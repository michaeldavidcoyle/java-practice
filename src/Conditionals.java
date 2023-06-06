public class Conditionals {
    public static void main(String[] args) {
        branch(true); // True
        branch(false); // False

        switchCase("A"); // A
        switchCase("B"); // B
        switchCase("C"); // C
        switchCase("X"); // Default

        speak("dog");
        speak("cat");
        speak("human");
    }

    static void branch(boolean condition) {
        if (condition) { // when condition is true the next block executes and the else is ignored
            System.out.println("True");
        } else { // runs only when condition is false
            System.out.println("False");
        }
    }

    static void speak(String animal) {
        if (animal.equals("dog")) {
            System.out.println("woof");
        } else if (animal.equals("cat")) {
            System.out.println("meow");
        } else {
            System.out.println("hello");
        }
    }

    static void switchCase(String value) {
        switch (value) {
            case "A":
                System.out.println("A");
                break; // important to prevent falling through to next case
                // break could be left out if fall-through is desired
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
