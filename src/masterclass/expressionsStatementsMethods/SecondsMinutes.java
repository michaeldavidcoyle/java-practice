package masterclass.expressionsStatementsMethods;

public class SecondsMinutes {
    private static final String invalidSeconds = " is not a valid input for seconds, argument must be in the range 0 to 59.";
    private static final String invalidMinutes = " is not a valid input for minutes, argument must be non-negative.";

    public static String getDurationString(int seconds) {
        if (seconds < 0) return seconds + invalidSeconds;;

        int totalMinutes = seconds / 60;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + minutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return minutes + invalidMinutes;
        }
        if (seconds < 0 || seconds > 59) {
            return seconds + invalidSeconds;
        }

        return getDurationString(minutes * 60 + seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(-99));
        System.out.println(getDurationString(1000));
        System.out.println(getDurationString(2398));
        System.out.println(getDurationString(7777));
        System.out.println(getDurationString(367, 44));
        System.out.println(getDurationString(792, 38));
        System.out.println(getDurationString(189, 27));
        System.out.println(getDurationString(-89, 2));
        System.out.println(getDurationString(42, -7));
        System.out.println(getDurationString(426, 71));
    }
}
