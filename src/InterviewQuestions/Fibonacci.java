package InterviewQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        //1. way with for loop
        // 1 1 2 3 5 8 13 21 34 ...
        int a=1;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<8; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        System.out.println();
        //2. way with array
        int[] fib=new int[10];
        fib[0]=1;
        fib[1]=1;
        for(int i=0; i<8; i++){
            fib[i+2]=fib[i+1]+fib[i];
            //System.out.print(fib[i]+" ");
        }
        for(int i=0; i<10; i++){
            System.out.print(fib[i]+" ");
        }
    }
}
