
public class QueueUsingLinkedListUse {

    public static void main(String[] args){
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        for(int i=1;i <= 40;i++){
            queue.enQueue(i);
        }
        while(!queue.isEmpty()){
            try {
                System.out.println(queue.deQueue());
            } catch (QueueEmptyException e) {
                // Never Reach Here
            }
        }
    }
}
