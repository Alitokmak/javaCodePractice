package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        String str="([}){{((}{{}}]))";
        System.out.println(Parant(str));

    }
    public static boolean Parant(String str){
        Map<String,Integer> map=new HashMap<>();
        for(String each :str.split("")){
            map.put(each,map.getOrDefault(each,0)+1);
        }
        return map.get("(")==map.get(")") && map.get("{")==map.get("}") && map.get("[")==map.get("]") ;
    }
}
