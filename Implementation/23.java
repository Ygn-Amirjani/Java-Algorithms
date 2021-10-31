import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EqualizeTheArray{

    private static final Map<Integer,Integer> map = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }

        System.out.println(findingDuplicates());  //First Solution
        System.out.println(findingDuplicates(array)); // Second Solution
    }

    private static int findingDuplicates(){
        boolean bool = false ;
        int counter = 0 ;
        for(int i=0; i<array.length; i+=1){
            for(int j=0; j<array.length; j+=1){
                if (j!= i && array[i] == array[j]){
                    counter++;
                    bool = true ;
                }
            }
            if(bool == true)
                break ;
        }
        return array.length - (counter+1) ;
    }

    private static int findingDuplicates(int[] a){
        int max = 1 ;
        for(int i : a){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
                if(max < map.get(i)){
                    max = map.get(i);
                }
            }
        }
        return a.length - max ;
    }

}