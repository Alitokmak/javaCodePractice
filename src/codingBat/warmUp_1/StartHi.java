package codingBat.warmUp_1;
/*Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/
public class StartHi {
    public static void main(String[] args) {
       String str="hi there";
        System.out.println(startHi(str));
    }
    public static boolean startHi(String str){
        if(str.length()<2)
            return false;
        String firstTwo=str.substring(0,2);
        if(firstTwo.equals("hi")){
            return true;
        }else{
            return false;
        }
    }
}
