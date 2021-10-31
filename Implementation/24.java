import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ACMICPCTeam{

    private static final Map<Integer, Integer> map = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
    private static int[] len  = new int[2];
    private static String[] array;

    public static void main(String[] args) {
        for(int i=0; i<len.length; i+=1){   //for(int i : len) -> for each
            len[i] = input.nextInt();    // i = input.nextInt();
        }
        array = new String[len[0]];
        for(int i=0; i<array.length; i+=1){     //for(int i : array) -> for each
            array[i] = input.next();      // i = input.nextInt();
        }

        pass();
    }
    
    private static void pass(){
        int max = 0 , index = 1 ;
        for(int i=0; i<array.length-1; i+=1){
            for(int j=i+1; j<array.length; j+=1){
                if(max < check(array[i], array[j])){
                    max = check(array[i], array[j]);
                    map.put(index,max);
                    index++;
                }
            }
        }
        awnser(max);
    }

    private static int check(String one, String two){
        int counter = 0 ;
        for(int i=0; i<len[1]; i+=1){
            if(one.charAt(i) == '1' || two.charAt(i) == '1'){
                counter +=1 ;
            }
        }
        return counter ;

    }

    private static void awnser(int find){
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue() == find){
                System.out.println(find);
                System.out.println(i.getKey());
            }
        }
    }


}