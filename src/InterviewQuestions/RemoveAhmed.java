package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 Given a list of people' names: "Ahmed", "John", Eric",
"Ahmed".....
Write a java operation to remove all the names named Ahmed
*/
public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        //1. way with iterator
       Iterator<String> newList =list.iterator();
       while(newList.hasNext()){
           if(newList.next().equals("Ahmed"))
               newList.remove();
       }
        System.out.println(list);

        //2. way
       list.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list);

    }
}
