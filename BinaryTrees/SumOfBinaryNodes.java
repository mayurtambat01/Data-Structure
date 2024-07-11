import java.util.Scanner;

public class SumOfBinaryNodes {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter Next Node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static int Sum(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        return root.data + Sum(root.left) + Sum(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(Sum(root));
    }
    
}