import java.util.EmptyStackException;

public class StackOfLinkedList<E> {
    
    private Node<E> head ;
    /** the head of stack */

    private int len = 0 ;
    /** for find the size of stack */

    /** add element into stack */
    public void push(E new_element)
    {
        if(isEmpty()) 
            head = new Node<E>(new_element);  

        else
            head = new Node<E>(new_element,head) ;
        
        len += 1 ;
    }

    /** Remove the top element of the stack  */
    public E pop()
    {
        Node<E> dNode ;
        if(isEmpty())
            throw new EmptyStackException();
        else
        {
            dNode = head ;
            head = head.next ;
            len -= 1 ;
        }

        return dNode.value ;
    }

    /** search in stack */
    public int search(E element)
    {
        int counter = 1 ;
        Node<E> tmp ;
        if(isEmpty())
            throw new EmptyStackException();
        else
        {
            tmp = head ;
            for(int i=0; i<len; i+=1)
            {
                if(tmp.value == element)
                    return counter ;

                tmp = tmp.next ;
                counter += 1 ;
            }

            return -1 ;
        }
    }

    /** This method removes all elements of the stack  */
    public void clear()
    {
        head = null ;
        len = 0 ;
    }

    /** Return the last element added . */
    public E peek()
    {
        return head.value ;
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
