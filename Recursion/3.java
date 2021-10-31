import java.util.*;

class Revisited{


    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[2];
    private static int[] arr ;
    private static int len ;
    
    public static void main(String[] args) {
        len = input.nextInt();

        for(int i=0; i<len; i+=1){
            array[0] = input.nextInt();
            array[1] = input.nextInt();

            arr = new int[array[1]];
            for(int j=0; j<array[1]; j+=1){
                arr[j] = input.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(fr(array[0],arr,1));
        }
    
    }

    public static int fr(int n, int[] a , int count){
        if(a.length+1 == count)
            return 0 ;
        else
            if(n / a[a.length-count] == 1 || n % a[a.length-count] != 0)
                return fr(n,a,count+1);
            else
                return 1 + ((n / a[a.length-count]) * fr(a[a.length-count],a,count+1));     

    }

}