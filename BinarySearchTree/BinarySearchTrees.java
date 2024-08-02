
public class BinarySearchTrees {
    
    private BinaryTreeNode<Integer> root;

    public void insertNode(int data){
        root = insertNode(root, data);
    }
    private BinaryTreeNode<Integer> insertNode(BinaryTreeNode<Integer> root,int data){
        if (root==null) {
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
        }
        if (root.data > data) {
            root.left = insertNode(root.left, data);            
        }else{
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void deleteNode(int data){

    }
    public boolean hasNode(int data){
        return hasNode(root, data);
    }
    private boolean hasNode(BinaryTreeNode<Integer> root,int data){
        if (root==null) {
            return false;
        }
        if (root.data==data) {
            return true;
        }else if(root.data < data){
            return hasNode(root.left, data);
        }else{
            return hasNode(root.right, data);
        }
    }

    public void print(){
        print(root);
    }
    private void print(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        String s = root.data + "";
        if (root.left != null) {
            s += "L: " + root.left.data + ",";            
        }
        if (root.right != null) {
            s += "R: " + root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }
}
