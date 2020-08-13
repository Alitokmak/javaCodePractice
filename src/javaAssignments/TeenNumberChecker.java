package javaAssignments;
/**
 * 5. Teen Number Checker
 *
 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 * Write a method named hasTeen with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true if ONE of the
 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
 * false.
 */
public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(10,15,14));

    }
    public static boolean hasTeen(int x, int y, int z) {
        if(isTeen(x)) {
            return true;
        }
        if(isTeen(y)) {
            return true;
        }
        if(isTeen(z)) {
            return true;
        }
        return false;
    }

    // We can initialize isTeen method first
    // Then pass the parameter to hasTeen method

    public static boolean isTeen(int number) {
        if(number>=13 && number<=19) {
            return true;
        }else {
            return false;
        }
    }
}
