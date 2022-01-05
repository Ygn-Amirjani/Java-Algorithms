import java.util.*;

abstract class SupperPhrases {

    public final Map<Character, Integer> priority = new HashMap<>();
    public final Stack<Character> stack = new Stack<>();
    public final Scanner input = new Scanner(System.in);
    public static String output_str = "";
    public String input_str ;

    public void Start() {
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('%', 2);
        priority.put('^', 3);

        System.out.print("Input : ");
        input_str = input.next();
    }

    public int stackPeekPriority() {
        if (!stack.isEmpty()) {
            for (Map.Entry<Character, Integer> map : priority.entrySet()) {
                if (stack.peek() == map.getKey())
                    return map.getValue();
            }
        }
        return -1;
    }

    public  String reverse() {
        String reverse_str = "" ;
        for(int i=output_str.length()-1; i>=0; i-=1)
            reverse_str += output_str.charAt(i);

        return reverse_str ;
    }

    public abstract String convert();
}