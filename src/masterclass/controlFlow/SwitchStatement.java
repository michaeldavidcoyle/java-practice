package masterclass.controlFlow;

/*
 * switch statement syntax:
 * switch (value) {
 *     case x:
 *         // execute code for value == x
 *         break;
 *     case y:
 *         // execute code for value == y
 *         break;
 *     default:
 *         // anything not explicitly covered by cases
 */

public class SwitchStatement {
    public static void main(String[] args) {
//        int value = 1;
//        int value = 2;
//        int value = 3;
//
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was neither 1 nor 2");
//        }

        // standard switch statement
//        int switchValue = 3;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//             case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Value was 3, 4 or 5");
//                System.out.println("Actually, it was " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not a 1, 2, 3, 4 or 5");
//                break;
//        }

        int switchValue = 3;

        // enhanced switch (JDK 14 and up)
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually, it was " + switchValue);
            }
            default -> System.out.println("Value was not a 1, 2, 3, 4 or 5");
        }

        String month4 = "April";
        String month9 = "December";
        String monthDay = "Wednesday";
        System.out.println(month4 + " is in the " + getQuarter(month4) + " quarter.");
        System.out.println(month9 + " is in the " + getQuarter(month9) + " quarter.");
        System.out.println(monthDay + " is in the " + getQuarter(monthDay) + " quarter.");
    }

    public static String getQuarter(String month) {
        // old way
//        switch (month) {
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd";
//            case "October":
//            case "November":
//            case "December":
//                return "4th";
//        }

        // enhanced switch
        return switch (month) { // enhanced switch is an expression (evaluates to single value)
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "\"invalid month\"";
            /*
            * if a code block is desired (rather than a single return value)
            * curly braces must be used, along w/ the 'yield' keyword:
            * default -> {
            *     String response = "Invalid month: " + month;
            *     yield response;
            * }
            */
        };
    }
}
