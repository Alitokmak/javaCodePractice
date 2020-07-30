package InterviewQuestions;
/*
 Write a return method that can sort an int array in Descending and Ascending
order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7}; (Descending)
arr = Sort(arr); ==>{ 7, 8, 9, 10}; (Ascending)
*/
import java.util.Arrays;

public class DescendingAscending {
    public static void main(String[] args) {
        int[] arr={5,25,15,28,69,46};
        System.out.println(Arrays.toString(Descending(arr)));
        System.out.println(Arrays.toString(Ascending((arr))));


    }

    public static int[] Descending(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] Ascending(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
