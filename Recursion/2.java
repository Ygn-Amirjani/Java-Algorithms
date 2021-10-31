import java.util.Scanner;

class SubProblems{

    private static final Scanner input = new Scanner(System.in);
    private static String str1, str2 ;
    public static void main(String[] args) {
        str1 = input.next();
        str2 = input.next();
        System.out.println(lcs(str1,str2));
    }

    public static int lcs(String s1, String s2){
        if(s1.length() == 0 || s2.length() == 0)
            return 0;
        else
            if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1))
                return 1 + lcs(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1));
            else
                return Math.max(lcs(s1.substring(0,s1.length()-1),s2.substring(0,s2.length())),
                lcs(s1.substring(0,s1.length()),s2.substring(0,s2.length()-1)));
    }

}