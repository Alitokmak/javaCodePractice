package javaAssignments;
import java.util.HashMap;
import java.util.Map;

/**
 * 15. Recurring Word Counter
 *
 * Given a phrase, count the occurrences of each word in that phrase.
 *
 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
 * free: 1
 */
public class RecurringWordCounter {

    public static void main(String[] args) {
        String string="olly olly in come free";

        Map<String, Integer> map = new HashMap<>();
        String[] str=null;
        str=string.split(" ");

        for(int i=0; i<str.length; i++) {
            if(map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i])+1);
            }else {
                map.put(str[i], 1);
            }
        }
        System.out.println(map);
    }


}
