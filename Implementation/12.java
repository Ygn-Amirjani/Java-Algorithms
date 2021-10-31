import java.util.Scanner;

class ViralAdvertising{

    private static final Scanner input = new Scanner(System.in);
    private static int share = 5, like = 0, cumulative =0, n ;

    public static void main(String[] args) {
        n = input.nextInt();

        for(int i=0; i<n; i+=1){
            like = Math.abs(share / 2);
            cumulative += like;
            share = like * 3 ;
        }

        System.out.println(cumulative);
    }
}