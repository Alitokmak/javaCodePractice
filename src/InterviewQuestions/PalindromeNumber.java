package InterviewQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1234321;
        System.out.println(isPalindrome(num));

    }

    public static boolean isPalindrome(long num) {
        long remain =num;
        long rev =0;
        long digit=0;
        while(remain !=0) {
            digit =remain %10;
            rev = rev*10 +digit;
            remain /=10;
        }
        return num==rev;
    }

}
