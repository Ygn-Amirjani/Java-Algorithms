import java.util.Scanner;

class AppendAndDelete{

    private static final Scanner inpuut = new Scanner(System.in);
    private static String s, t ;
    private static int k, sub = 0, counter = 0;

    public static void main(String[] args) {
        s = inpuut.next();
        t = inpuut.next();
        k = inpuut.nextInt();

        if(s.equalsIgnoreCase(t)){
            counter = s.length()*2 + 1 ;
        }else{
            int len = s.length() > t.length() ? t.length() : s.length() ;
            for(int i=0; i<len; i+=1){
                if(s.charAt(i) != t.charAt(i)){
                    sub = i ;
                    break ;
                }
            }
            if(sub == 0){
                sub = len ;
            }
            counter = t.length() - sub ;
            counter = counter + s.substring(sub).length() ;
        }
        if(counter == k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}