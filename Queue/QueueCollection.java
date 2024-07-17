import java.util.Queue;
import java.util.LinkedList;

public class QueueCollection{

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i <= 10;i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}