import java.util.Scanner;

class CatsAndMouse {
    
    private static final Scanner input = new Scanner(System.in);
    private static int len, x, y, z;

    public static void main(String[] args) {
        len = input.nextInt();

        for(int i=0; i<len; i+=1){
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            check();
        }

    }

    private static void check(){
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if(catA < catB){
            System.out.println("Cat A");
        }else{
            if(catB < catA){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }

    }
}
