package challenges;

/*
 * Write a function that returns a duration (given as a number of seconds) in a human-readable way.
 * This function will only take a non-negative integer and return a duration expressed as a combination
 * of years, days, hours, minutes and seconds. If the number is 0, the function must return "now".
 * Example:
 * Input: 4782 | Output: 1 hour, 19 minutes and 42 seconds
 * Input: 84773672123 | Output: 2688 years, 56 days, 18 hours, 15 minutes and 23 seconds
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HumanReadableDuration {
    final static int MIN = 60;
    final static int HOUR = MIN * 60;
    final static int DAY = HOUR * 24;
    final static int YEAR = DAY * 365;

    public static String duration(long seconds) {
        if (seconds == 0) return "now";

        long years = seconds / YEAR;
        long secondsRemaining = seconds - years * YEAR;
        long days = secondsRemaining / DAY;
        secondsRemaining -= days * DAY;
        long hours = secondsRemaining / HOUR;
        secondsRemaining -= hours * HOUR;
        long minutes = secondsRemaining / MIN;
        secondsRemaining -= minutes * MIN;

        String yUnits = years > 1 ? " years" : " year";
        String dUnits = days > 1 ? " days" : " day";
        String hUnits = hours > 1 ? " hours" : " hour";
        String mUnits = minutes > 1 ? " minutes" : " minute";
        String sUnits = secondsRemaining > 1 ? " seconds" : " second";

        String[] times = {
            years > 0 ? years + yUnits : "",
            days > 0 ? days + dUnits : "",
            hours > 0 ? hours + hUnits : "",
            minutes > 0 ? minutes + mUnits : "",
            secondsRemaining > 0 ? secondsRemaining + sUnits : ""
        };

        ArrayList<String> humanReadable = new ArrayList<>();

        for (String t : times) {
            if (!t.isEmpty()) {
                humanReadable.add(t);
            }
        }

        return String.join(", ", humanReadable) ;
    }

    public static void main(String[] args) {
        System.out.println(duration(0L));
        System.out.println(duration(3600L));
        System.out.println(duration(4782L));
        System.out.println(duration(90001L));
        System.out.println(duration(180002L));
        System.out.println(duration(10499273L));
        System.out.println(duration(84773672123L));
    }
}
