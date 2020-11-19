package codingBat.warmUp_2;
/*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1*/
public class Array667 {
    public static void main(String[] args) {
        int[] arr={6,7,2};
        System.out.println(array667(arr));
    }
    public static int array667(int[] arr){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==6){
               if(arr[i+1]==6 || arr[i+1]==7){
                   count++;
               }
            }
        }
        return count;
    }
}
