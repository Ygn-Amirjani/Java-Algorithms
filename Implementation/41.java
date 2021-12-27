import java.util.Scanner;

class FairRations{

    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int len,counter = 0 ;
    
    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];
        for(int i=0; i<array.length; i+=1)
            array[i] = input.nextInt() ;

        for(int i=0; i<array.length-1; i+=1){
            if(isOdd(array[i])){
                array[i] += 1 ;
                array[i+1] += 1 ;
                counter += 2 ;
            }
        }

        if(isOdd(array[array.length-1]))
            System.out.println("NO");
        else
            System.out.println(counter);

    }

    public static boolean isOdd(int num){
        if(num % 2 == 0)
            return false ;

        return true ;
    }
}