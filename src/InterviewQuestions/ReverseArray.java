package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
        reverse1(arr);
    }
    public static void reverse(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }

    public static void reverse1(Integer[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=arr.length-1; i>=0; i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
