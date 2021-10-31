import java.util.Scanner;

class ThePowerSum{

    private static final Scanner input = new Scanner(System.in);
    private static int x, n, count = 1; 

    public static void main(String[] args) {
        x = input.nextInt();
        n = input.nextInt();
        System.out.println(fp(x, n, count));
    }

    public static int fp(int x, int n, int count){
        int value = x - (int)Math.pow(count, n);

        if(value < 0)
            return 0 ;
        else {
            if(value == 0)
                return 1 ;
            else
                return fp(value, n, count+1) + fp(x, n, count+1);
        }
    }


}