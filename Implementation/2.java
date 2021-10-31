import java.util.*;

class MigratoryBirds {

    private static final HashMap<Integer,Integer> map = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int counter ;
    private static int x = 0 ;
    private static int len ;


    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];

        for(int i=0; i<len; i+=1){
            array[i] = input.nextInt();
            map.put(array[i], count(array[i]));
        }

        for(Map.Entry<Integer,Integer> fined : map.entrySet()){
            if(fined.getValue() >= x){
                x = fined.getValue();
            }
        }

        int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }

    private static int count(int n){
        counter = 0 ;
        for(int i=0; i<array.length; i+=1){
            if(n == array[i]){
                counter++;
            }
        }
        return counter ;
    }

}