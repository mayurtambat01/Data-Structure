import java.util.Scanner;

public class SumOfAllNodes {

    public static TreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Next Node Data");
        int n=s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter Number Of Child "+n);
        int childCount = s.nextInt();
        for(int i=0;i < childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static int Sum(TreeNode<Integer> root){
        int sum = root.data;
        for(TreeNode<Integer> child : root.children){
            sum += Sum(child);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println(Sum(root));
    }
}
