import java.util.Scanner;

class Exceptions_StringToInteger{

    private static final Scanner input = new Scanner(System.in);
    private static String str ;
    private static int n ;

    public static void main(String[] args) {
       str = input.next();
       try {
           n = Integer.parseInt(str);
           System.out.println(n);
           
       } catch (Exception e) {
           System.out.println("Bad String");
       } 
    }

}