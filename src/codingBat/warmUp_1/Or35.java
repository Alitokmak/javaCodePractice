package codingBat.warmUp_1;
/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod
or35(3) → true
or35(10) → true
or35(8) → false*/
public class Or35 {
    public static void main(String[] args) {
       int arr=10;
        System.out.println(or35(arr));
    }
    public static boolean or35(int arr){
        if(arr<0){
            return false;
        }
        return (arr%3==0) || (arr%5==0);
    }
}
