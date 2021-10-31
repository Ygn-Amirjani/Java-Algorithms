import java.util.*;

class PickingNumbers {

    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Integer> list = new ArrayList<>();
    private static final ArrayList<Integer> mux = new ArrayList<>();
    private static int[] array ;
    private static int len ;

    public static void main(String[] args) {
        len = input.nextInt();
        array = new int[len];

        for(int i=0; i<len; i+=1){
            array[i] = input.nextInt();
        }

        for(int i=0; i<array.length; i+=1){
            list.clear();
            add_list(i);
        }

        System.out.println(Collections.max(mux));
    }

    private static void add_list(int tmp){
        list.add(array[tmp]);

        for(int i=0; i<array.length; i+=1){
            if( tmp == i ){
                continue;
            }else{
                if(check(array[i])){
                    list.add(array[i]);
                }
            }
        }
        mux.add(list.size());
    }

    private static boolean check(int tmp){
        int find ;
        for(int i=0; i<list.size(); i+=1){
            find = Math.abs(list.get(i) - tmp);
            if(find > 1){
                return false;
            }
        }
        return true ;
    } 
}
