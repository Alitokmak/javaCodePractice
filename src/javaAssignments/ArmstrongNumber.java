package javaAssignments;
/**
 * 16. Armstrong Number
 *
 * An Armstrong number is a number that is the sum of its own digits each raised
 * to the power of the number of digits.
 *
 * For example:
 *
 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
 * a number is an Armstrong number.
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));

    }

    public static boolean isArmstrongNumber(int input) {
        int a = 0;
        int b = 0;
        int temp = input;
        if (input > 0 && input < 10) {
            return true;
        } else if (input > 99 && input <= 999) {
            while (input > 0) {
                a = input % 10;
                input /= 10;
                b = b + (a * a * a);
            }
            if (temp == b) {
                return true;
            }

        } else if (input > 999 && input <= 9999) {
            while (input > 0) {
                a = input % 10;
                input /= 10;
                b = b + (a * a * a * a);
            }
            if (temp == b) {
                return true;
            }

        }
        return false;
    }
}