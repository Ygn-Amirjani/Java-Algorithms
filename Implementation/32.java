import java.util.*;

class Calculator{

   public int n, p ; 

   public int power(int n, int p) throws Exception{
        /*  if (throws Exception)
         *      dont Error;
         *  elese
         *      Error ; 
         */
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
   }

   public String getMessage(){
       return "n and p should be non-negative" ;
   }

}

class MoreExceptions{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
