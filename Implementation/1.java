import java.util.Scanner;

class BetweenTwoSets {

    private static final Scanner input = new Scanner(System.in);
    private static final int[] len = new int[2] ;
    private static int low, upp, counter ;

    public static void main(String[] args) {
        
        for (int i=0; i<len.length; i+=1){
            len[i] = input.nextInt();
        }

        int[] a = new int[len[0]];
        int[] b = new int[len[1]];
        
        for(int i=0; i<a.length; i+=1){
            a[i] = input.nextInt();
        }

        for(int i=0; i<b.length; i+=1){
            b[i] = input.nextInt();
        }

        low = use(b)[0];
        upp = use(a)[1];

        for(int i=1; i<=low; i+=1){
            if((upp*i) > low){
                break;
            }else{
                if(div(a,(upp*i)) && div(b,(upp*i))){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }

    private static int[] use (int[] array){
        int[] arr = new int[2];
        int min = array[0];
        int max = array[0];
        for(int i=0; i<array.length; i+=1){
            if(min > array[i]){
                min = array[i];
            }
            if(max < array[i]){
                max = array[i];
            }
        }

        arr[0] = min ;
        arr[1] = max ;
        return arr ;
    }

    private static boolean div(int[] array, int tmp){
        for(int i=0; i<array.length; i+=1){
            if(array[i] >= tmp){
                if(array[i] % tmp != 0){
                    return false;
                }
            }else{
                if(tmp % array[i] != 0){
                    return false;
                }
            }
        }
        return true ;
    }
    
    
}
