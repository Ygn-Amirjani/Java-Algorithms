import java.util.Scanner;

class ElectronicsShop {

    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[3];
    private static int[] keyboards ;
    private static int[] drives;
    private static int sum = 0 ;

    public static void main(String[] args) {

        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }

        keyboards = new int[array[1]];
        drives = new int[array[2]];

        for(int i=0; i<keyboards.length; i+=1){
            keyboards[i] = input.nextInt();
        }

        for(int i=0; i<drives.length; i+=1){
            drives[i] = input.nextInt();
        }

        int tmp ;
        for(int i=0; i<keyboards.length; i+=1){
            for(int j=0; j<drives.length; j+=1){
                tmp = keyboards[i] + drives[j];
                if(tmp <= array[0]){
                    if(sum < tmp){
                        sum = tmp ;
                    }
                }
            }
        }
        
        System.out.println(sum == 0 ? -1 : sum);
    }
    
}
