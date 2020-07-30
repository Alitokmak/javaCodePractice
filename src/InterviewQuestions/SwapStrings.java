package InterviewQuestions;

public class SwapStrings {
    public static void main(String[] args) {
        String str1="abc";
        String str2="def";

        str1+=str2; //abcdef
        str2 = str1.replace(str2,""); //abc
        str1=str1.replace(str2,""); //def

        System.out.println(str1);
        System.out.println(str2);
    }
}
