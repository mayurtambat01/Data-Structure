
import java.util.PriorityQueue;
import java.util.Comparator;

class StringPQComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        }else if (o1.length() > o2.length()) {
            return 1;
        }
        return 0;
    }
}
class StringRevPQComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return 1;
        }else if (o1.length() > o2.length()) {
            return -1;
        }
        return 0;
    }
}

public class MinMaxPQComparatorString {

    public static void main(String[] args) {
        String arr[] = {"Hey","I","Please","Am"};
        // StringPQComparator strPQ = new StringPQComparator();
        // PriorityQueue<String> pq = new PriorityQueue<>(strPQ);
        StringRevPQComparator strRevPQ = new StringRevPQComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(strRevPQ);
        for(int i=0;i < arr.length;i++){
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
    }
}