
import java.util.PriorityQueue;

public class InbuildPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[] = {4,9,1,0,5,6};
        for(int i=0;i < arr.length;i++){
            pq.add(arr[i]);
        }
        // System.out.print(pq.element());
        while (! pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
    }        
}