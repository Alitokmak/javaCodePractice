package codingBat.warmUp_1;
/*Given two int values, return their sum. Unless the two values are the same,
then return double their sum.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
public class SumDouble {
    public static void main(String[] args) {
      int a=3;
      int b=3;
        System.out.println(sumDouble(a,b));
    }
    public static int sumDouble(int a, int b){
        int sum=a+b;
        if(a==b){
            return 2*(a+b);
        }
        return sum;
    }
}
