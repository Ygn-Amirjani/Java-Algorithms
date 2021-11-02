public class SinglyLinkedList<E>
{
    Node<E> node = new Node<>();

    private Node<E> head ;
    /** the head of linked list */

    private int len = 0 ;
    /** for find the size of list */


    /** add element into linked list */
    public void add(E new_element)
    {
        if(isEmpty())
        {
            //add element and put the node equals to null
            head = new Node<E>(new_element);
            len += 1 ;
        }
        else
        {
            //add element in the last node of the list
            Node<E> new_node = new Node<E>(new_element);
            Node<E> count = head ;
            for(int i=0; i<len-1; i+=1)
                count = count.next;
            
            new_node.next = count.next;
            count.next = new_node ;
            len += 1 ;
            
        }

        
    }

    /** Take the element index and return the element */
    public E get(int index)
    {
        try{    
            Node<E> tmp = head;
            for(int i=0; i<index; i+=1)
                tmp = tmp.next;
    
            return tmp.value;
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }
    }

    /** I want to use the overload concept 
     * in this method , removed the first of element in list
    */
    public void remove()
    {
        head = head.next;
        len -= 1 ;
    }

    /** remove the linst.get(index) */
    public void remove(int index)
    {
        Node<E> tmp = head ;
        for(int i=0; i<index-1; i+=1)
            tmp = tmp.next;
           
        try { 
            if(index == (size()-1))
            {
                tmp.next = null ;
                len -= 1;
            }
            else
            {
                if(index == 0)
                    remove();
                else
                {
                    tmp.next = tmp.next.next ;
                    len -= 1 ;
                }
            }
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }

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