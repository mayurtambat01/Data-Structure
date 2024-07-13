import java.util.Scanner;

public class NumOfLeafs {

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
    public static int numLeaves(BinaryTreeNode<Integer> root){
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(numLeaves(root));
    }
    
}