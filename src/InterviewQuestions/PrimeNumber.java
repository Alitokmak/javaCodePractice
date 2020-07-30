package InterviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=99;
        System.out.println(primeNumber(num));
        wholePrimeNumber(num);

    }
    public static boolean primeNumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void wholePrimeNumber(int num){
        for(int i=0; i<num; i++){
            if(primeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
}
