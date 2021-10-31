import java.util.Scanner;

class StrangeCounter{

    private static final Scanner input = new Scanner(System.in);
    private static int n, sum = 3, tmp = 3, counter = 1 ;

    public static void main(String[] args) {
        n = input.nextInt();

        while(sum < n){
            tmp *= 2 ;
            sum += tmp;
        }

        for(int i=sum; i>n; i-=1){
            counter++;
        }

        System.out.println(counter);

    }
}