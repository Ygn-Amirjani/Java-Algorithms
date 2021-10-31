import java.util.Scanner;

class JumpingOnTheClouds{

    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }
        int count = -1;
        for (int i = 0; i < len; i++, count++) {
            if (i<len-2 && array[i+2]==0) i++;
        }
        
        System.out.println(count);  
    }
}