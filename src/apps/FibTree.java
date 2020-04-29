package apps;

public class FibTree {

    public static void main(String[] args) {

        TreeNode node = FibTree.generateArg(5);
        System.out.println(toString(node));

    }

    public static String toString(TreeNode root) {
        return (root == null) ? "()" : toString(root.left) + "\n   \\   \n    " + root.value + "   \n  / \n" + toString(root.right) + "\n  \\ ";
    }


    public static TreeNode generateArg(int k) {

        TreeNode node;
        if (k - 2 >= 0) {
            node = new TreeNode(k, generateArg(k - 2), generateArg(k - 1));
        } else {
            node = new TreeNode(k, null, null);
        }

        return node;
    }
}

class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}