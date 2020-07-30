package InterviewQuestions;

import java.util.Arrays;

/*
 Write a method that can find the maximum number from an int
Array
*/
public class MaxArray {
    public static void main(String[] args) {
        int[] arr={5,15,10};
        System.out.println(MaxValue1(arr));
        System.out.println(MaxValue2(arr));
    }
    //for loop
    public static int MaxValue1(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //Array sort method
    public static int MaxValue2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
