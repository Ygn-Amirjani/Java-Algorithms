import java.util.HashMap;
import java.util.Scanner;

class DictionariesAndMaps{

    private static final HashMap<String,Integer> map = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
    private static String str ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();

        for(int i=0; i<len; i+=1){
            map.put(input.next(),input.nextInt());
        }
        for(int i=0; i<len; i+=1){
            str = input.next();
            find(str);
        }
    }

    private static void find(String s){
        if(map.get(s) == null){
            System.out.println("Not found");
        }else{
            System.out.printf("%s=%d%n",s,map.get(s));
        }
    }
}