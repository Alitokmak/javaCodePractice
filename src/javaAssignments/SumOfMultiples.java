package javaAssignments;
import java.util.ArrayList;
import java.util.List;

/**
 * 20. Sum of Multiples
 *
 * Given a number, find the sum of all the unique multiples of particular
 * numbers up to but not including that number.
 *
 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
 * get 3, 5, 6, 9, 10, 12, 15, and 18.
 *
 * The sum of these multiples is 78.
 */
public class SumOfMultiples {

    public static void main(String[] args) {
        int[] set = {4,6};
        System.out.println(getSumOfMultiples(4,set));

    }

    public static int getSumOfMultiples(int i, int[] set) {
        List<Integer> list= new ArrayList<>();
        int sum=0;
        for(int j=0; j<i; j++) {
            for(int k=0; k<set.length;  k++) {
                if(j%set[k]==0) {

                    if(!list.contains(j)) {
                        list.add(j);
                        sum+=j;
                    }

                }
            }
        }
        return sum;
    }

}
