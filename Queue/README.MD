# Queue In Java

Queue works on the principle of FIFO (First In First Out), it means that the first item added to the queue will be the first item to be removed. Or the last item added to the queue will be the last item to be removed.Here are three of the most important queue functions :

## 1. Offer (new_element) Or Add (new_element)

This function adds a new element to the end of the queue. In Offer it returns false if the queue is full, but in Add it returns an IllegalStateException() if the queue is full, which is why we prefer Offer to Add.

## 2. Poll () Or Remove ()

In this function we remove the first element (head). Note that in both functions we first return the head and then delete it. In Poll we return null if the queue is empty, but in Remove we return an NoSuchElementException() if the queue is empty. That's why we prefer Poll to Remove . 

## 3. Peek () Or element ()

In these two functions we return the element that entered first (head). In Peek we return null if the queue is empty, but in Element we return an Exception() if the queue is empty. That's why we prefer Peek to Element . 

