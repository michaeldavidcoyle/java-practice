package masterclass.controlFlow;

public class SwitchChallenge {
    public static String getNatoWord(char letter) {
        // contrived example, could replace with HashMap (char => word)
        switch (letter) {
            case 'A':
                return "Alpha";
             case 'B':
                return "Baker";
             case 'C':
                return "Charlie";
             case 'D':
                return "Dog";
             case 'E':
                return "Easy";
             case 'F':
                return "Fox";
             case 'G':
                return "George";
             case 'H':
                return "How";
             case 'I':
                return "Item";
             case 'J':
                return "Jig";
             case 'K':
                return "King";
             case 'L':
                return "Love";
             case 'M':
                return "Mike";
             case 'N':
                return "Nan";
             case 'O':
                return "Oboe";
             case 'P':
                return "Peter";
             case 'Q':
                return "Queen";
             case 'R':
                return "Roger";
             case 'S':
                return "Sugar";
             case 'T':
                return "Tare";
             case 'U':
                return "Uncle";
             case 'V':
                return "Victor";
             case 'W':
                return "William";
             case 'X':
                return "X-ray";
             case 'Y':
                return "Yoke";
             case 'Z':
                return "Zebra";
            default:
                return letter + " not found";
        }
    }

    public static void printDayOfWeek(int day) {
        // again, could just as easily be a HashMap(int => dayOfWeek)
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Day " + day + " is " + dayOfWeek);
    }

    public static void main(String[] args) {
        char a = 'A';
        char b = 'M';
        char c = 'X';
        char d = '?';

        System.out.println("NATO word for " + a + " is " + getNatoWord(a));
        System.out.println("NATO word for " + b + " is " + getNatoWord(b));
        System.out.println("NATO word for " + c + " is " + getNatoWord(c));
        System.out.println("NATO word for " + d + " is " + getNatoWord(d));

        for (int day = 0; day <= 7; day++) {
            printDayOfWeek(day);
        }
    }
}
