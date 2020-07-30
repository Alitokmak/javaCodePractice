package InterviewQuestions;

public class ReverseInteger {
    public static void main(String[] args) {
        //1. way argoritma
        int num=12345;
        int rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
        //2.way with string buffer
        int num1=12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
