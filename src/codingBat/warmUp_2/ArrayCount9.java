package codingBat.warmUp_2;
/*Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3*/
public class ArrayCount9 {
    public static void main(String[] args) {
        int[] arr={1,2,9,9};
        System.out.println(arrayCount9(arr));
    }
    public static int arrayCount9(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==9){
                count++;
            }
        }
        return count;
    }
}
