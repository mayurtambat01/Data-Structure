import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i <= 30;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
