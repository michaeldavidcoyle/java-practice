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

    public static void main(String[] args) {
        char a = 'A';
        char b = 'M';
        char c = 'X';
        char d = '?';

        System.out.println("NATO word for " + a + " is " + getNatoWord(a));
        System.out.println("NATO word for " + b + " is " + getNatoWord(b));
        System.out.println("NATO word for " + c + " is " + getNatoWord(c));
        System.out.println("NATO word for " + d + " is " + getNatoWord(d));
    }
}
