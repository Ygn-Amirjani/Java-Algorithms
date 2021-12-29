import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackOfArrayList<E> {
    
    private final ArrayList<E> stack ;
    /** Array List for create the stack */

    private int len = 0 ;
    /** for find the size of stack */

    /**Constructor  */
    public StackOfArrayList()
    {
        stack = new ArrayList<>();
    }

    /** add element into stack */
    public void push(E new_element)
    {
        stack.add(new_element);
        len += 1 ;
    }

    /** Remove the top element of the stack  */
    public E pop()
    {
        if(isEmpty())
            throw new EmptyStackException();
        else
        {
            len -= 1  ;
            return stack.remove(len);
            
        }
    }

    /** search in stack */
    public int search(E element)
    {
        int counter = 1 ;
        if(isEmpty())
            throw new EmptyStackException();
        else
        {
            for(int i=len-1; i>=0; i-=1)
            {
                if(stack.get(i) == element)
                    return counter ;

                counter += 1 ;
            }

            return -1 ;
        }
    }

    /** Return the last element added . */
    public E peek() 
    {
        return stack.get(len-1);
    }
    
    /** if stack is Empty return False else return true */
    public boolean isEmpty() 
    {
        return len == 0 ;
    }

    /** return The size of stack  */
    public int size() 
    {
        return len ;
    }

}