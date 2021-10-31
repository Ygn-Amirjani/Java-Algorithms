import java.util.Scanner;

class LibraryFine{

    private static final Scanner input = new Scanner(System.in);
    private static final int[] first = new int[3];
    private static final int[] second = new int[3] ;

    public static void main(String[] args) {
        give(first);
        give(second);

        if(first[2] < second[2]){
            System.out.println(0);
        }else{
            if(first[2] == second[2]){
                if(first[1] < second[1]){
                    System.out.println(0);
                }else{
                    if(first[1] == second[1]){
                        if(first[0] <= second[0]){
                            System.out.println(0);
                        }else{
                            System.out.println(15 * (first[0] - second[0]));
                        }

                    }else{
                        System.out.println(500 * Math.abs(first[1] - second[1]));
                    }
                }
    
            }else{
                System.out.println(10000);
            }
        }
    }

    private static void give(int[] array){
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }
    }
}