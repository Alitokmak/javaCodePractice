package codingBat.warmUp_2;
/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true*/
public class Array123 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,1};
        System.out.println(array123(arr));
    }
    public static boolean array123(int[] arr){
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3){
                return true;
            }
        }
        return false;
    }
}
