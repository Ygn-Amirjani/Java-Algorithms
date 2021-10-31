import java.util.ArrayList;
import java.util.Scanner;

class SaveThePrisoner{

    private static final ArrayList<Integer> array = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();

        for(int i=0; i<len; i+=1){
            give();
            System.out.println(find());
        }
    }

    private static void give(){
        array.clear();
        for(int i=0; i<3; i+=1){
            array.add(input.nextInt());
        }
    }

    private static int find(){
        int tmp = array.get(1);
        int result ;
        while(tmp > array.get(0)){
            tmp = tmp - array.get(0);
        }
        result = tmp + (array.get(2)-1);
        return result ;
    }
}