package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,5,6};
        UnionArray(arr1,arr2);

    }
    public static void UnionArray(int[] arr1, int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        for(int each : arr1){
            list.add(each);
        }
        for(int each: arr2){
            if(!list.contains(each)){
                list.add(each);
            }
        }
        System.out.println(list);
    }
}
