package javaAssignments;
/**
 * 21. Three Magic Numbers
 *
 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
 * return 3 random numbers using the java.util.Random class.
 *
 * Write a method to return an int array of 3 random numbers between 1 - 100.
 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
 */

/*
 * 22. Easy Guessing Game
 *
 * Create a program to generate a number between the given range:
 * int x = minimum
 * iny y = maximum (inclusive)
 *
 * You must use the Math.random class to generate a random number between x and y.
 */
public class ThreeLuckyNumber {

    public static void main(String[] args) {
        System.out.println(threeLuckyNumbers());
        System.out.println(guessingGame(10,3));

    }


    public static int[] threeLuckyNumbers() {
        int[] arr=new int[3];
        for(int i=0; i<3; i++) {
            arr[i]=(int) Math.random()*(100-1)+1;
        }
        return arr;
    }


    public static int guessingGame(int x, int y) {

        return (int) Math.random()*(y-x)+x;
    }
}
