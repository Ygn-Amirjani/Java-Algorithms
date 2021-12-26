import java.util.*;

class ICPCTeam {

    private static final Scanner input = new Scanner(System.in) ;
    private static final Map<Integer,Integer> map = new HashMap<>();
    private static int[] len = new int[2] ;
    private static String[] array ;
    private static int maximum = 0;

    public static void main(String[] args) {
        
        for(int i=0; i<len.length; i+=1) 
            len[i] = input.nextInt() ;

        array = new String[len[0]] ;
        for(int i=0; i<array.length; i+=1)
            array[i] = input.next() ;

        for(int i=0; i<array.length; i+=1){
            for(int j=i; j<array.length; j+=1){
                find(array[i], array[j]);
            }
        }

        maximum = Collections.max(map.keySet());
        System.out.println(maximum); 
        System.out.println(map.get(maximum));

    }

    public static void find(String str1, String str2) {
        int num1, num2, counter = 0 ;
        for(int i=0; i<len[1]; i+=1){
            num1 = Character.getNumericValue(str1.charAt(i)) ;
            num2 = Character.getNumericValue(str2.charAt(i)) ;
            if(num1 == 1 || num2 == 1)
                counter += 1 ;
        }
        if(map.containsKey(counter))
            map.replace(counter, map.get(counter)+1) ;
        else
            map.put(counter, 1);
    }
}