package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class t6_对称二叉树 {

 public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public boolean isSymmetric(TreeNode root) {
        return dfs(root,root);
    }
    public boolean dfs(TreeNode u,TreeNode v){
        if(u==null&&v==null)return true;
        if(u==null||v==null)return false;
        return u.val==v.val&&dfs(u.left,v.right)&&dfs(u.right,v.left);
    }

}
