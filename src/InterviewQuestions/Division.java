package InterviewQuestions;
/*
 Write a method that can divide two numbers without using
division operator
*/
public class Division {
    public static void main(String[] args) {
        int num1=5;
        int num2=2;
        if(num2==0){
            System.out.println("Cannot divide zero");
        }else if(num1<num2){
            System.out.println(num1+" cannot divide to "+num2);
        }else{
            int result=0;
            while(num1>=num2){
                num1-=num2;
                result++;
            }
            System.out.println(result+" remainder of "+num1);

        }
    }
}
