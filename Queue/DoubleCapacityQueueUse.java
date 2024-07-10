
public class DoubleCapacityQueueUse {

    public static void main(String[] args) {
        DoubleCapacityQueue queue = new DoubleCapacityQueue(10);
        for(int i=1;i <= 22;i++){
            queue.enQueue(i);
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.deQueue());
            } catch (QueueEmptyException e) {
                //Never Reach here
            }
        }
    }
}
