package InterviewQuestions;

import java.util.Arrays;

/*
 Write a method that can find the minimum number from an int
Array
*/
public class MinArray {
    public static void main(String[] args) {
        int[] arr={5,15,10};
        System.out.println(MinValue1(arr));
        System.out.println(MinValue2(arr));
    }
    //for loop
    public static int MinValue1(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int each : arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
    //Arrays sort method
    public static int MinValue2(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
