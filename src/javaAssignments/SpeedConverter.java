package javaAssignments;
/**
 * 1.A Speed Converter - Convert to MilesPerHour
 *
 * Write a method called toMilesPerHour that has 1 parameter of type double with
 * the name kilometersPerHour. This method needs to return the rounded value of
 * the calculation of type long.
 *
 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
 * needs to return -1 to indicate an invalid value.
 *
 * Otherwise if it is positive, calculate the value of miles per hour, round it
 * and return it. For conversion and rounding use Math.round().
 */
public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10));

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }else {
            return Math.round(kilometersPerHour*0.6213);
        }

    }

}
