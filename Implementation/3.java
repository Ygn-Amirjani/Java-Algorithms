import java.util.*;

class SalesByMatch {
    
    private static final Scanner input = new Scanner(System.in);
    private static final Set<Integer> set = new HashSet<>();
    private static int counter = 0 ;
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];

        for(int i=0; i<len; i+=1){
            array[i] = input.nextInt();
            set.add(array[i]);
        }

        Integer[] arr = set.toArray(new Integer[set.size()]);

        for(int i=0; i<arr.length; i+=1){
            counter += count(arr[i]);
        }

        System.out.println(counter);

    }

    private static int count(int n){
        int tmp = 0 ;
        for(int i=0; i<array.length; i+=1){
            if(array[i] == n){
                tmp++;
            }
        }
        tmp = tmp / 2 ;
        return tmp ;

    }
}
