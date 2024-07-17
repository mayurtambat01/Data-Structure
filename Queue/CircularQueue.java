
public class CircularQueue{

    private int data[];
    private int front;
    private int rear;
    private int size;

    CircularQueue(){
        data = new int[10];
        front = -1;
        rear = -1;
    }
    CircularQueue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enQueue(int elem) throws QueueExceptionFull{
        if(size==data.length){
            throw new QueueExceptionFull();
        }
        if (size==0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        size++;
        data[rear] = elem;
    }
    int deQueue() throws QueueEmptyException{
        if (size==0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        if (size==0) {
            front = -1;
            rear = -1;
        }
        size--;
        return temp;
    }
}