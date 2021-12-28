import java.util.Scanner;

class ReverseString{

    private static final Scanner input = new Scanner(System.in) ;
    private static char[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt() ;
        array = new char[len] ;
        for(int i=0; i<len; i+=1)
            array[i] = input.next().charAt(0);

        reverseString(array);
    }

    public static void reverseString(char[] s) {
        int array_length = s.length-1;
        char tmp ;
        for(int i=0; i<s.length/2; i+=1){
            tmp = s[i] ;
            s[i] = s[array_length-i];
            s[array_length-i] = tmp ;
        }
    }
}