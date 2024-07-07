
public class StackUsingLinkedList<T> {

    private Node<T> head;
    private int size;

    StackUsingLinkedList(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    T top() throws StackEmptyException{
        if (size==0) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    T pop() throws StackEmptyException{
        if (size==0) {
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

}