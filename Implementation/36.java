import java.util.Scanner;

class HalloweenSale {

    private static final Scanner input = new Scanner(System.in);
    private static int[] array = new int[4] ;
    private static int sum = 0, counter = 0 ;

    public static void main(String[] args) {

        for(int i=0; i<array.length; i+=1) 
            array[i] = input.nextInt() ;

        for(int i=array[0]; sum<=array[3]; i-=array[1]) {
            if( i > array[2] ) 
                sum += i ;
            else
                sum += array[2] ;

            counter += 1 ;
        }

        System.out.println(counter-1);
        
    }
}