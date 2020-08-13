package javaAssignments;
/**
 * 1.B Speed Converter - Print Conversion
 *
 * Write another method called printConversion with 1 parameter of type double
 * with the name kilometersPerHour. This method needs to return a String and
 * needs to calculate milesPerHour from the kilometersPerHour parameter.
 *
 * The String should print in the format: "XX km/h = YY mi/h"
 *
 * XX represents the original value kilometersPerHour. YY represents the rounded
 * milesPerHour from the kilometersPerHour parameter.
 *
 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
 * Value"
 */
public class SpeedConverter2 {

    public static void main(String[] args) {
        System.out.println(printConversion(10));

    }

    public static String printConversion(double kilometersPerHour) {
        String speed=kilometersPerHour+" km/h"+" = "+toMilesPerHour(kilometersPerHour)+" mi/h";
        if(kilometersPerHour<0) {
            return "Invalid Value";
        }
        return speed;
    }

    private static double toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }else {
            return Math.round(kilometersPerHour*0.6213);
        }

    }
}
