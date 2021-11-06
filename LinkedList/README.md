# Linked List In Java

Here I have three linked list classes called SinglyLinkedList, CirclyLinkedList and DoublyLinkedList, in which I have used classes Node and Array . In fact, unlike arrays, linked lists do not have consecutive memory but data is stored in a linear manner and work with links. also in this project we familiar with the concept of **Self Referential Structures**. 

```Java
    public class Node<E> {
    
        /** Reference the next node -> (Link) */
        public Node<E> next;

    }
```
## Singly Linked List

The first node is called the head; it points to the first node of the list and helps us access every other element in the list. the last node, also sometimes called the tail, points to NULL which helps us in determining when the list ends.

## Circly Linked List

The first is called the head knot. Points to the first node in the list and helps us access any other elements in the list. the next pointer of the last node points to the first node.

## Doubly Linked List

In doubly linked list, the next pointer of the last node points to the first node 
and the previous pointer of the first node points to the last node making the circular in both directions.
