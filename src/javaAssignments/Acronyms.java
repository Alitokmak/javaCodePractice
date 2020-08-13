package javaAssignments;
import java.util.ArrayList;

/**
 * 11. Acronyms
 *
 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
 * Acronyms)! Help generate some jargon by writing a program that converts a
 * long name like Portable Network Graphics to its acronym (PNG).
 */
public class Acronyms {

    public static void main(String[] args) {
        System.out.println(acronym("Portable Network Graphics"));

    }

    public static String acronym(String phrase) {
        String result="";
        phrase =phrase.replace('-',' ');
        ArrayList<String> list=new ArrayList<>();
        for(String each:phrase.split(" ")) {
            list.add(each);
        }
        for(int i=0; i<list.size(); i++) {
            result+=list.get(i).substring(0,1);
        }
        return result;
    }

}
