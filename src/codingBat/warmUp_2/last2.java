package codingBat.warmUp_2;
/*
Given a string, return the count of the number of times that
a substring length 2 appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2*/
public class last2 {
    public static void main(String[] args) {

        System.out.println(last2("xaxxaxaxx"));
    }
    public static int last2(String str){
        int num=0;
            if(str.substring(0)==str.substring(str.length()-1)){
                return num=1;
            }
        for(int i=0; i<str.length(); i++) {
            if (str.substring(0) != str.substring(str.length() - 1)) {
                num++;
            }
        }
        return num;
    }
}
