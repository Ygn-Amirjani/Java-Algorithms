import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    public Node<E> head ;
    /** the head of linked list */

    public Node<E> tail ;
    /** the tail of linked list */

    public int len = 0 ;
    /** for find the size of list */

    /** add element into linked list */
    public void add(E new_element)
    {
        if(isEmpty())
        {
            //In the first, the link to the right is null, and the left is null 
            head = new Node<E>(new_element);
            len += 1 ;
        }
        else
        {
            //When an element is added, NULL links to the next element 
            tail = new Node<E>(new_element, tail, head);
            Node<E> counter = head ;

            for(int i=0; i<size()-1; i+=1)
                counter = counter.next;

           tail.last = counter ;
           tail.next = null ;   // In tail, the link to the right is null, and the link to the left refers to the previous element 
           counter.next = tail ;
           len += 1 ;

        }

    }

    /** I want to use the overload concept 
     * in this method , removed the first of element in list
     * So the last element must point to the second element (which is now the first element) 
    */
    public void remove() throws NoSuchElementException
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
        {
            /** If the head is changed, the second element must be the head  */
            head = head.next ;
            head.last = null ;  // We put the link to the chat of the second element, which is now head is null
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
                for(int i=0; i<size(); i+=1)
                {
                    if(element == counter.value)
                    {
                        if(i == size()-1)
                        {
                            /** If the last one is changed, the previous element must be the last one  */
                            tail = counter.last ;
                            tail.next = null ;  // The link to the right of the last element should be null. 
                            len -= 1 ;
                        }
                        else
                        {
                            /** Pay attention to the two links left and right and change them  */
                            counter.last.next = counter.next ;
                            counter.next.last = counter.last ;
                            len -= 1 ;
                        }

                        break ;
                    }

                    counter = counter.next ;
                }

            }
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    /** Take the element index and return the element 
     * The nonsense method is used only for snooping :)
     * Be different  :))))
    */
    public E get(int index)
    {
        Node<E> counter ;
        if(index >= (size()/2))
        {
            counter = tail ;
            for(int i=size()-1; i>= size()/2; i-=1)
            {
                if(index == i)
                    break ;

                counter = counter.last;
            }
        }
        else
        {
            counter = head ;
            for(int i=0; i< size()/2; i+=1)
            {
                if(index == i)
                    break ;

                counter = counter.next ;
            }
        }

        return counter.value ;
       
    }

    /** Calculate the count (start from head) of the list manually */
    public int countHead()
    {
        Node<E> tmp = head ;
        int counter = 0 ;

        while( tmp != null )
        {
            tmp = tmp.next ;
            counter += 1 ;
        }

        return counter ;
    }

    /** Calculate the count (start from tail) of the list manually */
    public int countTail()
    {
        Node<E> tmp = tail ;
        int counter = 0 ;

        while( tmp != null ) 
        {
            tmp = tmp.last ;
            counter += 1 ;    
        }

        return counter ;
    }

    /** This method removes all elements of the list  */
    public void clear()
    {
        head = null ;
        tail = null ;
        len  = 0 ;
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
