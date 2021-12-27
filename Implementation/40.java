import java.util.Scanner;

class CircularArray{

    private static final Scanner input = new Scanner(System.in);
    private static int[] data_info = new int[3] ;
    private static int[] array ;
    private static int[] index ;

    public static void main(String[] args) {
        
        for(int i=0; i<data_info.length; i+=1) 
            data_info[i] = input.nextInt() ;

        array = new int[data_info[0]] ;
        for(int i=0; i<array.length; i+=1)
            array[i] = input.nextInt() ;

        index = new int[data_info[2]];
        for(int i=0; i<index.length; i+=1)
            index[i] = input.nextInt() ;

        for(int i=0; i<data_info[1]; i+=1){
            for(int j=array.length-1; j>0; j-=1){
                int tmp = array[j];
                array[j] = array[j-1] ;
                array[j-1] = tmp ;
            }
        }

        for(int i=0; i<index.length; i+=1)
            System.out.println(array[index[i]]);
    }
}