
public class StackUsingLinkedListUse {
    
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        for(int i=1;i <= 20;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never Reach Here
            }
        }
    }
}
