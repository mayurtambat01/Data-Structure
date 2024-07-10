
public class QueueUsingArrayUse {

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        for(int i=1;i <= 14;i++){
            try {
                queue.enQueue(i);
            } catch (QueueExceptionFull e) {
                //Never Reach Here
            }
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.deQueue());
            } catch (QueueEmptyException e) {
                //Never Reach Here
            }
        }
    }
    
}
