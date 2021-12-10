import java.util.NoSuchElementException;

public class CircleLinkedList<E>
{
    private Node<E> head ;
    /** the head of linked list */

    private int len = 0 ;
    /** for find the size of list */

    /** add element into linked list */
    public void add(E new_element)
    {
        if(isEmpty()){
        
            //add element and put the node equals to null
            head = new Node<E>(new_element);
            head.next = head ;
            
        }
        else
        {
            //add element in the last node of the list
            Node<E> new_node = new Node<E>(new_element,head);
            Node<E> counter = head ;

            for(int i=0; i<size()-1; i+=1)
                counter = counter.next;

            new_node.next = head ;  // The last link is equal to the first element of the list -> Circly Linked List
            counter.next = new_node ;

        }
        
        len += 1;
    }

    /** I want to use the overload concept 
     * in this method , removed the first of element in list
     * So the last element must point to the second element (which is now the first element) 
    */
    public void remove() throws NoSuchElementException
    {
        Node<E> counter = head ;

        if(isEmpty())
            throw new NoSuchElementException();
        else
        {
            for(int i=0; i<size()-1; i+=1)
                counter = counter.next;

            head = head.next ;
            counter.next = head ;   // Change the link of the last element 
            len -= 1 ;
        }

    }

    /** remove the element of list */
    public void remove(E element)
    {
        Node<E> counter = head ;

        try {
            if(counter.value == element)
                remove();
            else
            {
                for(int i=0; i<size()-1; i+=1)
                {
                    if(counter.next.value == element)
                    {
                        counter.next = counter.next.next ; // We link the previous element link to the next element 
                        len -= 1 ;
                        break ;
                    }
    
                    counter = counter.next ;
                }

            }

        } catch (Exception e) {
            throw new NoSuchElementException();
        }

    }

    /** reverse the list */
    public void reverse() throws NoSuchElementException
    {
        Node<E> current = head;
        Node<E> last_node = null ;
        Node<E> next_node = null ;

        if(isEmpty())
            throw new NoSuchElementException(" Linked List is Empty ");
        else
        {
            for(int i=0; i<size(); i+=1)
            {
                next_node = current.next ;
                current.next = last_node ;
                last_node = current ;
                current = next_node ;
            }
    
            head = last_node ;
            current.next = head ;   // Link the last element to the first element 

        }

    }

    /** Give index first and last and get their elements  */
    public Array<E> sublist(int start, int end)
    {
        Array<E> array = new Array<>(end - start);  // we went return E[] array, so write Array class.
        Node<E> tmp = head ;
        int counter = 0 ;

        try {

            for(int i=0; i<start; i+=1) // go to start index
                tmp = tmp.next;
        
            for(int i=start; i<end; i+=1)
            {
                array.setArray(counter, tmp.value);
                tmp = tmp.next;
                counter += 1 ;
            }
            
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }

        return array ;
    }

    /** If the captured element is in the linked list, we return true else return false 
     * we use linear search for this method
    */
    public boolean contains(E key)
    {
        Node<E> counter = head ;

        if(isEmpty())
            return false;
        else
        {
            for(int i=0; i<size(); i+=1)
            {
                if(counter.value == key)
                    return true ;

                counter = counter.next;
            }

            return false;
        }

    }

    /** convert E to String */
    public String toString(int index) throws IndexOutOfBoundsException
    {
        if(isEmpty())
            throw new IndexOutOfBoundsException();
        else
        {
            Node<E> counter = head ;
            String str = "";
    
            for(int i=0; i<index; i+=1)
                counter = counter.next ;
    
            return str + counter.value ;
        }

    }

    /** Take the element index and return the element */
    public E get(int index)
    {
        Node<E> counter = head ;

        try {

            for(int i=0; i<index; i+=1)
                counter = counter.next;

            return counter.value;

        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }

    }

    /** Calculate the count of the list manually */
    public int count()
    {
        Node<E> tmp = head.next ;
        int counter = 1 ;

        while( tmp != head )
        {
            tmp = tmp.next;
            counter += 1 ;
        }

        return counter ;

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
