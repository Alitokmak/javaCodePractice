package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values
greater than 100.
*/
public class RemoveGreaterThan100 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,0,20,120,140,25,400));
        System.out.println(list);
        //with second arraylist
        ArrayList<Integer> list2=new ArrayList<>();
        for(int each :list){
            if(each<100){
                list2.add(each);
            }
        }
        System.out.println(list2);
        //iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            if((int)itr.next()>100){
               itr.remove();
            }
        }
        System.out.println(list);
    }
}
