package javaAssignments;
/**
 * 7. Number In Word
 *
 * Write a method called printNumberInWord. The method has one parameter number
 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
 * for any other number including negative numbers. You can use if-else
 * statement or switch statement whatever is easier for you.
 */
public class NumberInWord {

    public static void main(String[] args) {
        System.out.println(printNumberInWord(8));
    }

    public static String printNumberInWord(int number) {
        if(number==1) {
            return "ONE";
        }
        if(number==2) {
            return "TWO";
        }
        if(number==3) {
            return "THREE";
        }
        if(number==4) {
            return "FOUR";
        }
        if(number==5) {
            return "FIVE";
        }
        if(number==6) {
            return "SIX";
        }
        if(number==7) {
            return "SEVEN";
        }
        if(number==8) {
            return "EIGHT";
        }
        if(number==9) {
            return "NINE";
        }

        return "OTHER";
    }
}
