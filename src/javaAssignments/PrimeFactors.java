package javaAssignments;
/**
 * 17. Prime Factors
 *
 * Compute the prime factors of a given natural number. A prime number is only
 * evenly divisible by itself and 1.
 *
 * Note that 1 is not a prime number.
 */
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(calculatePrimeFactorsOf(11));

    }

    public static List<Long> calculatePrimeFactorsOf(long l) {
        List<Long> list=new ArrayList<>();
        while (l%2==0)
        {
            list.add(2L);
            l /= 2;
        }
        for (long i = 3; i <= Math.sqrt(l); i+= 2)
        {
            while (l%i == 0)
            {
                list.add(i) ;
                l /= i;
            }
        }
        if (l > 2) {
            list.add(l);
        }
        return list;
    }

}
