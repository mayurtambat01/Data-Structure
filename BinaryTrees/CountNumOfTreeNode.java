import java.util.Scanner;

public class CountNumOfTreeNode {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static int Count(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        int ans = 1;
        ans += Count(root.left);
        ans += Count(root.right);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(Count(root));
    }
}