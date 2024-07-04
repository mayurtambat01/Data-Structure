
public class StackUsingArrayUse{

    public static void main(String[] args) throws StackFullException {
        
        StackUsingArray stack = new StackUsingArray();
        for(int i=1;i <= 9;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never Reach here
            }
        }
    }
}