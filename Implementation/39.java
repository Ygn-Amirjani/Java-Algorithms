import java.util.*;

class CutThesticks {

    private static Scanner input = new Scanner(System.in) ;
    private static List<Integer> list = new ArrayList<>();
    private static int len,mini ;

    public static void main(String[] args) {
        len = input.nextInt() ;
        for(int i=0; i<len; i+=1) 
            list.add(input.nextInt()) ;

        while (!list.isEmpty()) {
            System.out.println(list.size());
            mini = Collections.min(list) ;
            int i = 0 ;
            while (i < list.size()) {
                if(list.get(i)-mini == 0)
                    list.remove(i) ;
                else{
                    list.set(i, list.get(i)-mini);
                    i++ ;
                }
            }
        }

    }
}