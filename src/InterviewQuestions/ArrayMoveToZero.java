package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMoveToZero {
    public static void main(String[] args) {
        int[] arr ={1,3,5,0,6,0,0,5,8,20};
        System.out.println(Arrays.toString(moveToZero(arr)));

    }
    public static int[] moveToZero(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();
        int count=0;
        for(int each : arr){
            list.add(each);
            if(each==0){
                count++;
            }
        }
        int[] newArr=new int[arr.length];
        list.removeAll(Arrays.asList(0));
        for(int i=0; i<arr.length-count; i++){
            newArr[i]=list.get(i);
        }
        return newArr;
    }
}
