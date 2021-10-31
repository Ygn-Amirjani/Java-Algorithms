import java.util.Scanner;
import java.lang.Math;

class SherlockAndSquares{

    private static final Scanner input = new Scanner(System.in);
    private static int start, end;
    private static int count ;

    public static void main(String[] args) {
        count = input.nextInt();

        for(int i=0; i<count; i+=1){
            start = input.nextInt();
            end = input.nextInt();
            int sqA = (int)Math.ceil(Math.sqrt(start));
            int sqB = (int)Math.floor(Math.sqrt(end));
            System.out.println(sqB - sqA + 1);

        }
        
    }
}