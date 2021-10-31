import java.util.Scanner;

class BeautifulDaysAtTheMovies {

    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[3];
    private static int counter = 0 ;
    
    public static void main(String[] args) {
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }
        
        for(int i=array[0]; i<=array[1]; i+=1){
            if(Math.abs(i - (reverse(i))) % array[2] == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static int reverse(int a){
        StringBuilder str = new StringBuilder();
        str.append(a);
        str = str.reverse();
        String s = str.toString();
        return Integer.parseInt(s);
    }
}
