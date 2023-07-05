package masterclass.collections.lists;

import java.util.Random;

public class Enums {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("%nName is %s, ordinal value is %d", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayOfTheWeek.FRIDAY) {
//                System.out.print(", TGIF!");
//            }
            printDayAndOrdinal(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.printf("%s : %.2f%n", topping.name(), topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        DayOfTheWeek[] allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void printDayAndOrdinal(DayOfTheWeek weekDay) {
        String day = weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase();
        System.out.printf("%s is Day %d%n", day, weekDay.ordinal() + 1);
    }
}
