import java.util.Scanner;

public class PrintNodeAtDepthK {

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
    public static void Print(BinaryTreeNode<Integer> root,int k){
        if (root==null) {
            return;
        }
        if (k==0) {
            System.out.println(root.data);
            return;
        }
        Print(root.left, k-1);
        Print(root.right, k-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        Print(root, 2);        
    }
}
