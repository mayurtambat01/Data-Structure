import java.util.Scanner;

public class LargestNodeBinaryTree {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if(root.data == -1){
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if (root==null) {
            return -1;
        }
        int largestleft = largest(root.left);
        int largestright = largest(root.right);

        return Math.max(root.data, Math.max(largestleft, largestright));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(largest(root));    
    }
}