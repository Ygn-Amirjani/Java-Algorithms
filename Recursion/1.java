import java.util.Scanner;

class Factorial{


    private static final Scanner input = new Scanner(System.in);
    private static int n ;

    public static void main(String[] args) {
        n = input.nextInt();
        System.out.println(fac(n));
    }

    public static int fac(int n){
        if(n == 1 || n == 0)
            return 1 ;
        else
            return n * fac(n-1);
    }
}