
public class TreeNodeUse {

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        TreeNode<Integer> node1 = new TreeNode<Integer>(20);
        TreeNode<Integer> node2 = new TreeNode<Integer>(30);
        TreeNode<Integer> node3 = new TreeNode<Integer>(40);
        TreeNode<Integer> node4 = new TreeNode<Integer>(50);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);

        /*
        Output :
        root node = 10,
        Number of child (root)10 is 3 (20,30,40),
        number of child (node1)20 is 0,
        number of child (node2)30 is 1(50),
        number of child (node3)40 is 0. 
        */
    }
}