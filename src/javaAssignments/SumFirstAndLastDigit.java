package javaAssignments;
/**
 * 9. First and Last Digit Sum
 *
 * Write a method named sumFirstAndLastDigit with one parameter of type int
 * called number.
 *
 * The method needs to find the first and the last digit of the parameter number
 * passed to the method, using a loop and return the sum of the first and the
 * last digit of that number.
 *
 * If the number is negative then the method needs to return -1 to indicate an
 * invalid value.
 */
public class SumFirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(25));

    }

    public static int sumFirstAndLastDigit(int num) {
        if(num<0) {
            return -1;
        }
        int first=0;
        int last=num%10;
        while(num>=10) {
            first=num/10;
            num/=10;
        }
        return first+last;
    }

}
