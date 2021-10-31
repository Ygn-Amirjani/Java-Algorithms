import java.util.Scanner;

class FindDigits{

    private static final Scanner input = new Scanner(System.in);
    private static int len, n ;

    public static void main(String[] args) {
        len = input.nextInt();

        for(int i=0; i<len; i+=1){
            n = input.nextInt();
            System.out.println(find(n));
        }
    }

    private static int find(int result){
        int tmp = 0, counter = 0, check = result ;
        while(check >= 10){
            tmp = check % 10 ;
            check /= 10 ;
            if(tmp == 0){
                continue;
            }else{
                if( result % tmp == 0){
                    counter++;
                }
            }

        }
        if(result % check == 0){
            counter++;
        }

        return counter ;
    }
}