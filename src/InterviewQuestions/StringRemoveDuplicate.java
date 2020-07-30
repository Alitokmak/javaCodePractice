package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class StringRemoveDuplicate {
    public static void main(String[] args) {
        String str="aaabbccdddeeee";
        System.out.println(RemoveDuplicate(str));
        System.out.println(RemoveDuplicate1(str));
    }
    //with for loop
    public static String RemoveDuplicate(String str){
        String dup="";
        for(int i=0; i<str.length(); i++){
            if(!dup.contains(""+str.charAt(i))){
                dup+=""+str.charAt(i);
            }
        }
        return dup;
    }
    //with collection
    public static String RemoveDuplicate1(String str){
        str= new HashSet<String>(Arrays.asList(str.split(""))).toString();
        str=str.replaceAll("\\W","");
        return str;
    }
}
