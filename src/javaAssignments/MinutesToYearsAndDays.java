package javaAssignments;
/**
 * 6. Minutes To Years and Days Calculator
 *
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * The method should return a String and it needs to calculate the
 * years and days from the minutes parameter.
 *
 * If the parameter is less than 0, print text "Invalid Value".
 *
 * Otherwise, if the parameter is valid then it needs to print a message in the
 * format "XX min = YY y and ZZ d".
 *
 * XX represents the original value minutes. YY represents the calculated years.
 * ZZ represents the calculated days.
 */
public class MinutesToYearsAndDays {

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(10000));

    }

    public static String printYearsAndDays(long minutes) {
        String message = minutes + " min = " + ((minutes / 1440) / 365) + " y and " + ((minutes / 1440) % 365) + " d";
        if (minutes < 0) {
            return "Invalid Value";
        }
        return message;
    }
}