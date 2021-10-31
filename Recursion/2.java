import java.util.Scanner;

class Fibonachi{

    private static final Scanner input = new Scanner(System.in);
    private static int n;
    public static void main(String[] args) {
        n = input.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n == 1)
            return 0;
        else{

            if(n == 2 || n == 3)
                return 1 ;
            else 
                return fib(n-1) + fib(n-2) ;
        }

    }
}