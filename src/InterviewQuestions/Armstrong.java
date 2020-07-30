package InterviewQuestions;

public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        System.out.println(isArmstrong1(num));
        System.out.println(isArmstrong2(num));
        System.out.println(isArmstrong3(num));

    }
    public static boolean isArmstrong1(int num) {
        String number = String.valueOf(num);
        int power = number.length();
        int sum=0;
        for(int i=0; i<number.length(); i++) {
            int digit=Integer.parseInt(""+ number.charAt(i));
            sum += Math.pow(digit,power);

        }
        return sum== num;
    }
    public static boolean isArmstrong2(int num) {
        int digits = num;
        int sum = 0;
        int power=String.valueOf(num).length();
        while(digits !=0) {
            int each = digits %10;
            digits/=10;
            sum +=Math.pow(each, power);
        }
        return sum == num;

    }//153 = 1^3+ 5^3+ 3^3
    public static boolean isArmstrong3(int num) {
        int a=0;
        int b=0;
        int temp=num;
        while(num>0) { //153, 15 ,1
            a=num%10;   //3 , 5, 1
            num=num/10; //15 , 5 , 1
            b= b+(a*a*a); //27+ 125+1
        }
        if(b==temp) {
            return true;
        }

        return false;
    }
}

