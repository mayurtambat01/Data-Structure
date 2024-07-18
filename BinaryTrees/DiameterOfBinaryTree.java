
import java.util.Scanner;

public class DiameterOfBinaryTree {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootdata = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static int diameter(BinaryTreeNode<Integer> root){
        if (root==null) {
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1, Math.max(option2,option3));
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root==null) {
            return 0;
        }
        int heightleft = height(root.left);
        int heightright = height(root.right);

        return 1 + Math.max(heightleft, heightright);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(diameter(root));
    }
}