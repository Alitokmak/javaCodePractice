package InterviewQuestions;

import java.util.Arrays;
import java.util.TreeSet;

public class StringSameLetter {
    public static void main(String[] args) {
        String str1="aabc";
        String str2="bca";
        System.out.println(SameLetter(str1,str2));
        System.out.println(SameLetter1(str1,str2));
    }

    //1. way
    public static boolean SameLetter(String str1, String str2){
       char[] ch1=str1.toCharArray();
       char[] ch2=str2.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);

       String a="";
       String b="";

       for(char each: ch1){
           if(!a.contains(""+each)){
               a+=each;
           }
       }
       for(char each : ch2){
           if(!b.contains(""+each)){
               b+=each;
           }
       }
       return a.equalsIgnoreCase(b);
    }

    //2. way Collection
    public static boolean SameLetter1(String str1, String str2){
        str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equalsIgnoreCase(str2);
    }
}
