import java.util.Scanner;

class RecursiveDigitSum {

    private static final Scanner input = new Scanner(System.in);
    private static String n;
    private static int k ;

    public static void main(String[] args) {
        n = input.next();
        k = input.nextInt();
        System.out.println(superDigit(n,k));
        input.close();
    }

    static int superDigit(String number, int k) {
        if (number.length() > 1){
            long sum = 0;
            for (int i = 0; i < number.length(); i++){
                sum += Character.getNumericValue(number.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        }
        else
            return Integer.parseInt(number);

    }
    
}
