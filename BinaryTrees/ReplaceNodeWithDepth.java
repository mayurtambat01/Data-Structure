import java.util.Scanner;

public class ReplaceNodeWithDepth {

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
    public static void replace(BinaryTreeNode<Integer> root, int depth){
        if (root==null) {
            return;
        }
        root.data = depth;
        replace(root.left, depth + 1);
        replace(root.right, depth + 1);
    }
    public static void replace(BinaryTreeNode<Integer> root){
        replace(root, 0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        replace(root);
    }
    
}