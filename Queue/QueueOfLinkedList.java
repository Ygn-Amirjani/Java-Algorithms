import java.util.NoSuchElementException;

public class QueueOfLinkedList<E> {

    /** the head of Queue */
    private Node<E> head ;
    
    /** for find the size of list */
    private int len = 0 ;
   
    /** Max length of list For when the list length is not given   */
    private int max_len ;
    
    /**Constructor For when the list length is not given    */
    public QueueOfLinkedList(){
        this(10) ;
    }

    /** For when the list length is given  */
    public QueueOfLinkedList(int max_len) 
    {
        this.max_len = max_len;
    }

    /** add element into list */
    public boolean offer(E new_element)
    {
        if(isEmpty())
        {
            head = new Node<E>(new_element);
            len += 1 ;
        }
        else
        {
            if(len == max_len)
                return false ;  // When the list is full 
            else
            {
                Node<E> counter = head ;
                Node<E> tmp = new Node<E>(new_element);

                for(int i=0; i<len-1; i+=1)
                    counter = counter.next ;

                tmp.next = null ;
                counter.next = tmp ;
                len += 1 ;                
            }
        }

        return true ;
    }

    /** add element into  list */
    public void add(E new_element)
    {
        if(isEmpty())
        {
            head = new Node<E>(new_element);
            len += 1 ;
        }
        else
        {
            if(len == max_len)
                throw new IllegalStateException();  // When the list is full
            else
            {
                Node<E> counter = head ;
                Node<E> tmp = new Node<E>(new_element);

                for(int i=0; i<len-1; i+=1)
                    counter = counter.next ;

                tmp.next = null ;
                counter.next = tmp ;
                len += 1 ;
            }
        }
    }

    /** I want to use the overload concept 
     * in this method , removed the first of element in list
     * When list is Empty return null 
    */
    public E poll()
    {
        if(isEmpty())
            return null ;
        else
        {
            Node<E> tmp = head ;
            head = head.next ;
            len -= 1 ;
            
            return tmp.value ;
        }
        
    }

    /** I want to use the overload concept 
     * in this method , removed the first of element in list
     * When list is Empty thow Exeption
    */
    public E remove()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
        {
            Node<E> tmp = head ;
            head = head.next ;
            len -= 1 ;
            
            return tmp.value ;
        }
    }

    /** return head of list */
    public E peek()
    {
        if(isEmpty())
            return null ;
        else
            return head.value ;
    }

    /** reurn head of list */
    public E element()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
            return head.value ;
    }
    
    /** This method removes all elements of the list  */
    public void clear()
    {
        head = null ;
        len = 0 ;
    }

    /** if list is Empty return False else return true */
    public boolean isEmpty()
    {
        return len == 0 ;
    }

    /** return The size of list  */
    public int size()
    {
        return len ;
    }
}
