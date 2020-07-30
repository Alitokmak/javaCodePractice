package InterviewQuestions;

public class StringPasswordValidation {
    public static void main(String[] args) {
        String pass="Maljhgfgj23#";
        System.out.println(PassValid(pass));
    }
    //with regex
    public static boolean PassValid(String str){
        boolean hasLover=str.matches("(.*[a-z].*)");
        boolean hasUpper=str.matches("(.*[A-Z].*)");
        boolean hasDigit=str.matches("(.*[0-9].*)");
        boolean hasSpecial=str.matches("(.*\\W.*)");
        if(str.length()>=6 && !str.contains(" ") && hasLover && hasUpper && hasDigit && hasSpecial){
            return true;
        }
        return false;
    }
}
