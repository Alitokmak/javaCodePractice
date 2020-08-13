package InterviewQuestions;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int num=153;
        System.out.println(Armstrong(num));
    }
    public static boolean Armstrong(int num){
        int temp=num;
        int a=0;
        int b=0;
        while(num>0){
            a=num%10;
            num=num/10;
            b=b+(a*a*a);
        }
        if(temp==b){
            return true;
        }
        return false;
    }
}
