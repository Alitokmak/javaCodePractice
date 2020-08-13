package javaAssignments;
/**
 * 10. Reverse String
 *
 * Without using the StringBuilder or StringBuffer class, write a method that
 * reverses a String. Example: reverse("example"); -> "elpmaxe"
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse("Ali"));

    }

    public static String reverse(String string) {
        String reverse="";
        if(string.length()<2) {
            return string;
        }else {
            for(int i=string.length()-1; i>=0;i--) {
                reverse+=string.charAt(i);
            }
            return reverse;
        }
    }

}
