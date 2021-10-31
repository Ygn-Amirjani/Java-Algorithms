import java.util.Scanner;

class BinaryNumbers{

    private static final Scanner input = new Scanner(System.in);
    private static int n, max = 0, counter = 0 ; 
    
    public static void main(String[] args) {
        n = input.nextInt();
        while(n/2 != 0){
            if(n%2 == 1){
                counter++;
            }else{
                if(max <= counter)
                    max = counter ;

                counter = 0 ;
            }

            n /= 2 ;
        }

        if(n%2 == 1)
            counter++;
        
        if(max <= counter)
            max = counter ;
        
        System.out.println(max);

        input.close();
    }
}