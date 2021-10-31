import java.util.Scanner;

class SequenceEquation{

    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];

        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }

        for(int i=1; i<=len; i+=1){
            System.out.println(find(find(i)));
        }   
    }

    private static int find(int n){
        for(int i=0; i<array.length; i+=1){
            if(array[i] == n){
                return i+1 ;
            }
        }
        return 0 ;
    }
}