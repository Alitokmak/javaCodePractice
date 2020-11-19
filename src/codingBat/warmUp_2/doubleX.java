package codingBat.warmUp_2;
/*Given a string, return true if the first instance of
"x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true*/
public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axbb"));
    }
    public static boolean doubleX(String str){
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")){
                return true;
            }
        }
        return false;
    }
}
