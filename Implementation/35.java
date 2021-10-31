import java.util.Scanner;

class CavityMap{

    private static final Scanner input = new Scanner(System.in);
    private static String[] array ;
    private static char[] arr ;
    private static int len;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new String[len];

        for(int i=0; i<len; i+=1){
            array[i] = input.next();
        }

        for(int i=0; i<len; i+=1){
            arr = array[i].toCharArray();
            for(int j=1; j<arr.length-1; j+=1){
                if(arr[j] > arr[j-1] && arr[j] > arr[j+1]){
                    arr[j] = 'X';
                }
            }
            array[i] = String.valueOf(arr);
            System.out.println(array[i]);
        }        
    }

}