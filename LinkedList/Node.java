public class Node<E> 
{
    
    public E value ;
    /** The value of the node */

    public Node<E> last ;
    /** Reference the last node -> (Link) */

    public Node<E> next ;
    /** Reference the next node -> (Link) */

    /**Constructor  */
    public Node()
    {

    }

    /** When the list is empty  */
    public Node(E value)
    {
        this(value, null);
    }

    /** When the list is not empty  */
    public Node(E value, Node<E> next)
    {
        this.value = value ;
        this.next = next ;
    }

    /** For Doubly linked list */
    public Node(E value, Node<E> last, Node<E> next)
    {
        this.value = value ;
        this.last = last ;
        this.next = next ;

    }

}
