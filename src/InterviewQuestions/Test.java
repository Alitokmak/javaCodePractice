package InterviewQuestions;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String str="aaabbcdee";
        System.out.println(Unique(str));
    }
    public static String Unique(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}



