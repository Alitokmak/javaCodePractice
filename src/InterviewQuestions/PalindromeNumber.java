package InterviewQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1234321;
        System.out.println(isPalindrome(num));

    }

    public static boolean isPalindrome(int num) {
        int temp=num;
        int rev = 0;
        while(temp!=0){
            rev= rev*10+temp%10;
            temp/=10;
        }
        return num==rev;
    }

}
