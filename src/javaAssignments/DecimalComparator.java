package javaAssignments;
/**
 * 4. DecimalComparator
 *
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
 * double.
 *
 * The method should return boolean and it needs to return true if two double
 * numbers are the same up to three decimal places.
 *
 * Otherwise, return false;
 */
public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(10,15));

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        if(firstNum==secondNum) {
            return true;
        }else {
            return false;
        }
    }

}
