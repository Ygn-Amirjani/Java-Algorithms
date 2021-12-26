import java.util.Scanner;

class BeautifulTriplets {

    private static final Scanner input = new Scanner(System.in) ;
    private static int[] check = new int[2] ;
    private static int[] array ;
    private static int counter = 0 ;

    public static void main(String[] args) {
        
        for(int i=0; i<check.length; i+=1)
            check[i] = input.nextInt() ;

        array = new int[check[0]] ;
        for(int i=0; i<array.length; i+=1)
            array[i] = input.nextInt() ;

        for(int i=0; i<array.length; i+=1){
            if (findNumber(i)) {
                counter += 1 ;
            }
        }

        System.out.println(counter);
    }

    public static boolean findNumber(int index) {
        int result = array[index] ;
        for(int i=(index+1); i<array.length; i+=1) {
            if(Math.abs((result - array[i])) == check[1]){
                for(int j=i+1; j<array.length; j+=1) {
                    if (Math.abs((array[i] - array[j])) == check[1]) {
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
}