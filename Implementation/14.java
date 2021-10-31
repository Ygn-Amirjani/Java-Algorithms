import java.util.Scanner;

class CircularArrayRotation{

    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[3];
    private static int counter = 1 ;
    private static int[] queries ;
    private static int[] tmp ;
    private static int[] b ;

    public static void main(String[] args) {
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }
        queries = new int[array[2]];
        tmp = new int[array[0]];
        b = new int[tmp.length];
        for(int i=0; i<tmp.length; i+=1){
            tmp[i] = input.nextInt();
        }
        for(int i=0; i<queries.length; i+=1){
            queries[i] = input.nextInt();
        }
        rotation(tmp);
        while(counter < array[1]){
            rotation(b);
            counter++;
        }
        index();
    }

    private static void rotation(int[] arr){
        int[] rotate = new int[tmp.length];
        rotate[0] = arr[arr.length-1];
        for(int i=0; i<arr.length-1; i+=1){
            rotate[i+1] = arr[i];
        }
        b = rotate;
    }

    private static void index(){
        for(int i=0; i<queries.length; i+=1){
            System.out.println(b[queries[i]]);
        }
    }
}