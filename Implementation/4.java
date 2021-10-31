import java.util.Scanner;

class DrawingBook {

    private static final Scanner input = new Scanner(System.in);
    private static int  n, p, counter_one, counter_last = 0 ;

    public static void main(String[] args) {
        n = input.nextInt();
        p = input.nextInt();
        
        if(p % 2 == 0 || n % 2 != 0){
            n = n - 1 ;
            counter_one = p / 2 ;
        }else{
            p = p -1 ;
            counter_one = p / 2 ;
        }
        for(int i=n; i>p; i-=2){
            counter_last++;
        }

        System.out.println(counter_one > counter_last ? counter_last : counter_one );
    }
    
}
