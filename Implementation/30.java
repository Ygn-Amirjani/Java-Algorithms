import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference ;

	public Difference(int[] elements){
        this.elements = elements ;
        maximumDifference = 0 ;
    }

    public void computeDifference(){
        for(int i=0; i<elements.length; i+=1){
            for(int j=i+1; j<elements.length; j+=1){
                if(maximumDifference <= Math.abs(elements[i] - elements[j])){
                    maximumDifference = Math.abs(elements[i] - elements[j]) ;
                }
            }
        }
    }
}

class Scope{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}