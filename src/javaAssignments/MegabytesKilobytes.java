package javaAssignments;
/**
 * 2. MegaBytes and KiloBytes
 *
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
 * int with the name kiloBytes.
 *
 * The method should return a String and it needs to calculate the megabytes and
 * remaining kilobytes from the kilobytes parameter.
 *
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 *
 * XX represents the original value kiloBytes. YY represents the calculated
 * megabytes. ZZ represents the calculated remaining kilobytes.
 *
 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
 * = 2 MB and 452 KB"
 *
 * If the parameter kiloBytes is less than 0 then print the text "Invalid
 * Value".
 */
public class MegabytesKilobytes {

    public static void main(String[] args) {
        System.out.println(printMegaBytesAndKiloBytes(10005));

    }

    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
        String MegabytesAndKilobytes=kiloBytes+" KB = "+(int)(kiloBytes/1024)+" MB and "+(int)(kiloBytes%1024)+" KB";
        if(kiloBytes<0) {
            return "Invalid Value";
        }else {
            return MegabytesAndKilobytes;
        }

    }

}
