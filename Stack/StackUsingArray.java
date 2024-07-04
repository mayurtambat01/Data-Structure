
public class StackUsingArray {

    private int data[];
    private int top;

    StackUsingArray(){
        data = new int[10];
        top = -1;
    }
    StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1;
    }

    int size(){
        return top + 1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    int top() throws StackEmptyException{
        if (size()==0) {
            throw new StackEmptyException();
        }
        return data[top];
    }

    void push(int elem) throws StackFullException{
        if (size()==data.length) {
            throw new StackFullException();
        }
        top++;
        data[top] = elem;
    }
    int pop() throws StackEmptyException{
        if (size()==0) {
            throw new StackEmptyException();
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
