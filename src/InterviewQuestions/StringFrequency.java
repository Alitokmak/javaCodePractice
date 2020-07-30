package InterviewQuestions;
/*
5. Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequency {
    public static void main(String[] args) {
        String str="aaabbccdddeeee";
        System.out.println(Frequency(str));
    }

    public static String Frequency(String str){
        String nonDup="";
        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=""+str.charAt(i);
            }
        }
        String result="";
        for(int i=0; i<nonDup.length(); i++){
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(nonDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=nonDup.charAt(i)+""+count;
        }
        return result;
    }
}
