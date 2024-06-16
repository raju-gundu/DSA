package Trees.BinaryTrees;

public class TreeHeight {
    TreeNode root;
    TreeHeight() {
        root = null;
    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeHeight treeHeight = new TreeHeight();
        treeHeight.root = new TreeNode(10);
        treeHeight.root.left = new TreeNode(5);
        treeHeight.root.right = new TreeNode(20);
        treeHeight.root.left.left = new TreeNode(2);
        treeHeight.root.left.right = new TreeNode(7);
        treeHeight.root.right.right = new TreeNode(22);
        treeHeight.root.right.right.right = new TreeNode(50);
        treeHeight.root.right.right.left = new TreeNode(21);
        treeHeight.root.left.right.left= new TreeNode(6);
        treeHeight.root.left.right.right = new TreeNode(8);
        int h = treeHeight.height(treeHeight.root);
        System.out.println(h);

    }
}
