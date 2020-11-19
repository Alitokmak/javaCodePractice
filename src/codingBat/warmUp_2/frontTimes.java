package codingBat.warmUp_2;
/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"*/
public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
    }
    public static String frontTimes(String str, int n) {
        int strlength = 3;
        if(strlength> str.length()){
            strlength = str.length();
        }
        String firstLetter =str.substring(0,strlength);
        String result="";
        for(int i=0; i<n; i++){
            result=result+firstLetter;
        }
        return result;
    }
}
