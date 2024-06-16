package Trees.BinaryTrees;

import com.sun.source.tree.BinaryTree;

/*check whether two trees are mirror images or not*/
public class MirrorImages {
    TreeNode root,mroot;
    MirrorImages(){
        root = null;
        mroot = null;
    }
    public boolean checkMirror(TreeNode root, TreeNode mroot){
        if (root==null && mroot==null){
            return true;
        }
        if (root==null || mroot==null){
            return false;
        }
        if(root.val!=mroot.val){
            return false;
        }
        return checkMirror(root.left, mroot.right) && checkMirror(root.right, mroot.left);
    }

    public static void main(String[] args) {
        MirrorImages m = new MirrorImages();
        m.root=new TreeNode(1);
        m.root.left=new TreeNode(2);
        m.root.right=new TreeNode(5);
        m.root.left.left=new TreeNode(3);
        m.root.left.right=new TreeNode(4);

        m.mroot=new TreeNode(1);
        m.mroot.left=new TreeNode(5);
        m.mroot.right=new TreeNode(2);
        m.mroot.right.right=new TreeNode(3);
        m.mroot.right.left=new TreeNode(4);

        System.out.println(m.checkMirror(m.root,m.mroot));


    }
}
