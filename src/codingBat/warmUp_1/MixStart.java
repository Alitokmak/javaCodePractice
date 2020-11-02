package codingBat.warmUp_1;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false*/
public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }
    public static boolean mixStart(String str){
       if(str.length()<3){
           return false;
       }
       String two=str.substring(1,3);
       if(two.equals("ix")){
           return true;
       }
       return false;
    }
}
