
public class QueueUsingLinkedList<T> {
    
    private Node<T> front;
    private Node<T> rear;
    private int size;

    QueueUsingLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    T front() throws QueueEmptyException{
        if (size==0) {
            throw new QueueEmptyException();
        }
        return front.data;
    }

    void enQueue(T elem){
        Node<T> newNode = new Node<T>(elem);
        if (size==0) {
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    T deQueue() throws QueueEmptyException{
        if (size==0) {
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if (size==1) {
            rear = null;
        }
        size--;
        return temp;
    }
}
