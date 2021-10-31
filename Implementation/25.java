import java.util.Scanner;

class MinimumDistances{

    private static final Scanner input = new Scanner(System.in);
    private static int[] array ;
    private static int len, min = -1, counter = 0;

    public static void main(String[] args) {
        len =  input.nextInt();
        array = new int[len];

        for(int i=0; i<len; i+=1){
            array[i] = input.nextInt();
        }

        for(int i=0; i<array.length; i+=1){
            if(check(i, array[i]) !=0 && counter == 0){
                min = check(i, array[i]);
                counter = 1;
            }
            if(check(i, array[i]) !=0 && counter == 1 && min > check(i, array[i])){
                    min = check(i, array[i]) ;
            }

        }
        System.out.println(min);
    }

    private static int check(int num, int find){
        int result = 0 ;
        for(int i=num+1; i<len; i+=1){
            if(array[i] == find){
                result = Math.abs(num - i);
                break;
            }
        }
        return result ;
    }
}