package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindWord {
    public static void main(String[] args) {
        String str="olly Olly in come free";
        System.out.println(FindWord1(str));
        System.out.println(FindWord2(str));
        FindAllWord(str);
    }


    public static int FindWord1(String str){
        int result=0;
        for(int i=0; i<str.length()-3; i++){
            if(str.substring(i,i+4).equalsIgnoreCase("olly")){
                result++;
            }
        }
        return result;
    }

    public static int FindWord2(String str){
        int result=0;
        str=str.toLowerCase();
        while(str.contains("olly")){
            result++;
            str=str.replaceFirst("olly","");
        }
        return result;
    }

    public static void FindAllWord(String str){
        Map<String, Integer> map =new HashMap<>();
        str=str.toLowerCase();
        String[] strings=str.split(" ");
        //System.out.println(Arrays.toString(strings));
        for(String each :strings){
            map.put(each, map.getOrDefault(each,0)+1);
        }
        System.out.println(map);
    }
}
