import java.util.Scanner;

class TheHurdleRace {

    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[2];
    private static int[] height ;
    private static int diff ;
    
    public static void main(String[] args) {
        for(int i=0; i<array.length; i+=1){
            array[i] = input.nextInt();
        }

        height = new int[array[0]];
        for(int i=0; i<height.length; i+=1){
            height[i] = input.nextInt();
        }

        System.out.println(find());
    }

    private static int find(){
        for(int i=0; i<height.length; i+=1){
            if(height[i] > array[1]){
                if(diff < (height[i] - array[1])){
                    diff = height[i] - array[1];
                }
            }
        }
        return diff;
    }
}
