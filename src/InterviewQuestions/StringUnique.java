package InterviewQuestions;
/*
 Write a return method that can find the unique characters from the
String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/
import java.util.HashMap;
import java.util.Map;

public class StringUnique {
    public static void main(String[] args) {
        String str="aaabbcdee";
        System.out.println(Unique(str));
        UniqueMap(str);
    }
    //1. way with for loop
    public static String Unique(String str){
       String unique="";
       for(int i=0; i<str.length(); i++){
           int count=0;
           for(int j=0; j<str.length(); j++){
               if(str.charAt(i)==str.charAt(j)){
                   count++;
               }
           }
           if(count == 1){
               unique+=str.charAt(i);
           }
       }
       return unique;
    }

    //with map
    public static void UniqueMap(String str){
        Map<Character, Integer> a= new HashMap<>();
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                a.put(str.charAt(i),count);
            }
        }
        System.out.println(a);
    }

}
