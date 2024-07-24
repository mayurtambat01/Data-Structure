/*For a given a Binary Tree of type integer, 
duplicate every node of the tree and attach it to the left of itself. */

public class CreateInsertDuplicateNode{

    public static void InsertDuplicte(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);

        BinaryTreeNode<Integer> temp = root.left;
        root.left = duplicateNode;
        duplicateNode.left = temp;

        InsertDuplicte(root.left.left);
        InsertDuplicte(root.right);
    }

    public static void main(String[] args) {
        
    }
}