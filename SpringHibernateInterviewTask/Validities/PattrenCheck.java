package Validities;



import java.util.regex.Pattern;

    interface Expression {
    final static String ALPHABETIC_REG_EXP ="[a-zA-z\\s]*";
    final static String NUM_REG_EXP = "^.*[0-9].*$";
    
}

public class PattrenCheck {
    static Pattern pat;
    public static boolean isAlphabet(String Value){
        pat=Pattern.compile(Expression.ALPHABETIC_REG_EXP);
        return pat.matcher(Value).matches();
    } 
    public static boolean isNum(String num){
        pat=Pattern.compile(Expression.NUM_REG_EXP);
        return pat.matcher(num).matches();
    }
}
