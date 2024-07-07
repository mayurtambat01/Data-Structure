
public class DoubleCapacityStackUse {

    public static void main(String[] args) {
        DoubleCapacityStack stack = new DoubleCapacityStack(4);
        for(int i=1;i <= 40;i++){
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
