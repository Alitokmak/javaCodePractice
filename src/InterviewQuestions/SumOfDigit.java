package InterviewQuestions;
//Write a method that can return the sum of the digits in a string
public class SumOfDigit {
    public static void main(String[] args) {
        String str="abcd1234f5g";
        System.out.println(SumOfDigit(str));
    }
   public static int SumOfDigit(String str){
        int count=0;
        for(char each : str.toCharArray()){
            if(Character.isDigit(each)){
                count+=Integer.valueOf(""+each);
            }
        }
        return count;
   }
}
