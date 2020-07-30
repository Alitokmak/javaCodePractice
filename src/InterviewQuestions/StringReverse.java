package InterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(Reverse(str));
        System.out.println(Reverse1(str));
    }

    public static String Reverse(String str){
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static String Reverse1(String str){

        return new StringBuffer(str).reverse().toString();
    }
}
