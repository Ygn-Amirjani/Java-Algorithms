import java.util.Scanner;

class ModifiedKaprekarNumbers{

    private static final Scanner input = new Scanner(System.in);
    private static int hghit, low, result, tmp, sum ;

    public static void main(String[] args) {
        low = input.nextInt();
        hghit = input.nextInt();

        for(int i=low; i<hghit; i+=1){
            sum = 0 ;
            result = i * i ;
            while(result >= 10 && result < 999){
               tmp = result % 10 ;
               result = result / 10 ; 
               sum += tmp ;
            }
            sum += result ; 
            if(sum == i){
                System.out.printf("%d\t%d\n",i,sum);
            }     
        }
    }
}