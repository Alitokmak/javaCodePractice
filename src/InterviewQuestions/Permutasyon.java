package InterviewQuestions;
/* Given an array of 3 characters print all permutation
        combinations from the given characters
        [a,b,c]
        abc
        acb
        bac
        bca
        cab
        cba
        */
public class Permutasyon {
    public static void main(String[] args) {
        String str="abc";
        Permutasyon((str));
    }
    public static int Permutasyon(String str){
        if(str==null){
            return 0;
        }
        return permute("",str);
    }
    public static int permute(String a, String b){
        if(b.length()==0){
            System.out.println(a);
            return 1;
        }
        int sum=0;
        for(int i=0; i<b.length();i++){
            sum+=permute(a+b.charAt(i),b.substring(0,i)+b.substring(i+1));
        }
        return sum;
    }
}
