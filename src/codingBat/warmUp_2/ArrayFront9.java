package codingBat.warmUp_2;
/*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false*/
public class ArrayFront9 {
    public static void main(String[] args) {
      int[] arr={1,2,9,3,4};
        System.out.println(arrayFront9(arr));
    }
    public static boolean arrayFront9(int[] arr){
      int end=arr.length;
      if(end>4){
          end=4;
      }
      for(int i=0; i<end; i++){
          if(arr[i]==9){
              return true;
          }
      }
      return false;
    }
}
