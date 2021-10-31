import java.util.Scanner;

class DesignerPDFViewer{

    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[26];
    private static int counter , max = 0 ;
    private static String str ;

    public static void main(String[] args) {

        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }

        str = input.next();

        for(int i=0; i<str.length(); i+=1){
            num(str.charAt(i));
        }

        System.out.println(max*str.length());

    }

    private static void num(char c){
        counter = 0;
        for(char i='a'; i<='z'; i+=1){
            if(i == c){
                check(counter);
                break ;
            }
            counter++;
        }
    }

    private static void check(int count){

        for(int i=0; i<array.length; i+=1){
            if(count == i){
                if(max < array[i]){
                    max = array[i];
                }
                break ;
            }
        }
    }
}