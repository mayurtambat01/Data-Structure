
// import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class maxPQComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       if (o1 < o2) {
            return -1;
       }else if (o1 > o2) {
            return 1;
       }
        return 0;
    }
}

public class MaxPQComparator {

    public static void main(String[] args) {
        maxPQComparator maxPQ = new maxPQComparator();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQ);
        int arr[] = {8,4,6,2,3,5,1,9,0};
        for(int i=0;i < arr.length;i++){
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
    }
}

