import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculate implements AdvancedArithmetic {
    int result = 0 ;
    public int divisorSum(int n) {
        for(int i=1; i<=n; i+=1){
            if(n % i == 0)
                result += i ;
        }
        return result;
    }
}

class Interfaces{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculate(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}