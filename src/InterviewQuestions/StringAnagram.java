package InterviewQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2="listen";
        Anagram(str1,str2);
    }

    public static void Anagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
        }
        ArrayList<String> list=new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(list);
        ArrayList<String> list2 =new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);

        if(list.equals(list2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
