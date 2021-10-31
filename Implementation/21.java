import java.util.Scanner;

class RepeatedString{

    private static final Scanner input = new Scanner(System.in);
    private static String s ;
    private static int n ;

    public static void main(String[] args) {
        s = input.next();
        n = input.nextInt();
         
        if(s.equalsIgnoreCase("a")){
            System.out.println(n);
        }else{
            while(s.length() < n){
                s = s + s ;
            }
            if(s.length() == n){
                System.out.println(count());
            }else{
                s = s.substring(0,n);
                System.out.println(count());
            }
        }
    }

    private static int count(){
        int counter = 0 ;
        for(int i=0; i<s.length(); i+=1){
            if(s.charAt(i) == 'a'){
                counter++;
            }
        }
        return counter ;
    }
}