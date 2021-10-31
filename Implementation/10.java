import java.util.ArrayList;
import java.util.Scanner;

class AngryProfessor{

    private static final Scanner input = new Scanner(System.in); 
    private static final ArrayList<Integer> list = new ArrayList<>();
    private static final ArrayList<Integer> array = new ArrayList<>();
    private static int n ;

    public static void main(String[] args) {
        n = input.nextInt();

        for(int i=0; i<n; i+=1){
            give();
        }  
    }

    private static void give(){
        array.clear();
        list.clear();
        for(int i=0; i<2; i+=1){
            array.add(input.nextInt());
        }
        for(int i=0; i<array.get(0); i+=1){
            list.add(input.nextInt());
        }

        check_arrived();
    }

    private static void check_arrived(){
        int counter = 0 ;
        for(int i=0; i<list.size(); i+=1){
            if(list.get(i) <= 0){
                counter++;
            }
        }
        if(counter >= array.get(1)){
            System.out.println("NO");
        }else{
            System.out.println("Yes");
        }
    }
    
}
