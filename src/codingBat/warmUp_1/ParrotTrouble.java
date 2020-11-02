package codingBat.warmUp_1;
/*
We have a loud talking parrot.
The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20.
Return true if we are in trouble.
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false*/
public class ParrotTrouble {
    public static void main(String[] args) {
      boolean talking =true;
      int hour =6;
        System.out.println(parrotTrouble(talking,hour));
    }
    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour<7 || hour>20));
    }
}
