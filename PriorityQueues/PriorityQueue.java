
// Priority Queue Implementation.

import java.util.ArrayList;

public class PriorityQueue {
    
    private ArrayList<Integer> heap;

    public PriorityQueue(){
        heap = new ArrayList<>();
    }

    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return heap.size()==0;
    }
    public int getMin() throws PriorityException{
        if (isEmpty()) {
            throw new PriorityException();
        }
        return heap.get(0);
    }

    public void insert(int elem){
        heap.add(elem);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1)/2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            }else{
                return;
            }
        }
    }

    public int remove() throws PriorityException{
        if (isEmpty()) {
			throw new PriorityException();
		}
        
        int minEle=getMin();
        
        heap.set(0,heap.get(heap.size()-1));
        
        heap.remove(heap.size()-1);
        
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        while(leftChildIndex < heap.size())
        {
            int minIndex=parentIndex;
            
            if(heap.get(minIndex) > heap.get(leftChildIndex))
            {
                minIndex=leftChildIndex;
            }
            
            if(rightChildIndex < heap.size())
            {
                if(heap.get(minIndex) > heap.get(rightChildIndex))
            	{
                	minIndex=rightChildIndex;
            	}
            }
            
            if(minIndex == parentIndex)
            {
                return minEle;
            }
            
            int temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minIndex));
            heap.set(minIndex,temp);
            
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return minEle;
    }
}