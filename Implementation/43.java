import java.util.Scanner;

class MoveZeroes{

    private static final Scanner input = new Scanner(System.in) ;
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt(); 
        array = new int[len] ;
        for(int i=0; i<array.length; i+=1)
            array[i] = input.nextInt() ;

        moveZeroes(array);
    }

    public static void moveZeroes(int[] nums) {
        
    }


}