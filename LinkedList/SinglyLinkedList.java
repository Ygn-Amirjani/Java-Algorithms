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
            /*******Fix the bug, The element is only added to the top of the list*****/ 
            head =  new Node<E>(new_element,head);
            len +=  1 ;
        }

        
    }

    /** Take the element index and return the element */
    public E get(int index)
    {
        Node<E> tmp = head ;
        for(int i=0; i<index; i+=1)
        {
            tmp = tmp.next;
        }

        return tmp.value;
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