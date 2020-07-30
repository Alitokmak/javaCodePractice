package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinValueWithMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        map.put("a",5);
        map.put("b",10);
        map.put("c",25);
        map.put("d",3);
        System.out.println(MinValue(map));

     }
     public static int MinValue(Map<String, Integer> map){
        SortedSet<Integer> set= new TreeSet<>(map.values());
        return set.first();
     }
}
