import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String expression){
        Stack<Character> result = new Stack<>();
        for(char ch : expression.toCharArray()){
            if (ch=='(') {
                result.push(ch);
            }else if (ch==')') {
                if (result.isEmpty()) {
                    return false;
                }
                result.pop();
            }
        }
        return result.isEmpty();
    }

    public static void main(String[] args) {
        String str = "((())))";
        System.out.println(isBalanced(str));
    }
}
