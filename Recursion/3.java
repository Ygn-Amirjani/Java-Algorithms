import java.util.Scanner;

class Power{

    private static final Scanner input = new Scanner(System.in);
    private static double x;
    private static int n;

    public static void main(String[] args) {
        x = input.nextDouble();
        n = input.nextInt();
        System.out.printf("%.5f",fp(x,n));
    }

    public static double fp(double x, int n){
        if(n < 0){
            x = 1 / x ;
            n *= -1 ;
        }
        if(n == 0)
            return 1;
        else 
            return x * fp(x , n - 1);
    }

}