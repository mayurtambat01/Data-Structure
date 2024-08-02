/* Given a sorted integer array A of size n, which contains all unique elements. 
You need to construct a balanced BST from this input array. Return the root of constructed BST.

Note: If array size is even, take first mid as root.
*/

public class ConstructTree {
    
    public static BinaryTreeNode<Integer> SortedArray(int arr[],int n){
        return SortedArray(arr, 0, n-1);
    }
    public static BinaryTreeNode<Integer> SortedArray(int arr[],int startIndex,int endIndex){
        if (startIndex > endIndex) {
            return null;
        }
        int mid = (startIndex + endIndex)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

        root.left = SortedArray(arr, startIndex, mid - 1);
        root.right = SortedArray(arr, mid + 1, endIndex);

        return root;
    }
    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}