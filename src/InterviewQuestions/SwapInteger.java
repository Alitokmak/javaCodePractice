package InterviewQuestions;

public class SwapInteger {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        a+=b; //30
        b=a-b; //10
        a=a-b; //20

        System.out.println(a);
        System.out.println(b);
    }


}
