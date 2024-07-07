
public class DoubleCapacityStack{

    private int data[];
    private int top;

    DoubleCapacityStack(){
        data = new int[10];
        top = -1;
    }
    DoubleCapacityStack(int capacity){
        data = new int[capacity];
        top = -1;
    }

    int size(){
        return top + 1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    int top() throws StackEmptyException{
        if (size()==0) {
            throw new StackEmptyException();
        }
        return data[top];
    }

    void push(int elem){
        if (size()==data.length) {
            DoubleCapacity();
        }
        top++;
        data[top] = elem;   
    }
    private void DoubleCapacity() {
        int temp[]=data;
        data = new int[2 * temp.length];
        for(int i=0;i < temp.length;i++){
            data[i] = temp[i];
        }
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