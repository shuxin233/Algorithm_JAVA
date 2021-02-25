package Tree;
/*二叉树的中序遍历
        给定一个二叉树的根节点 root ，返回它的 中序 遍历。


        进阶: 递归算法很简单，你可以通过迭代算法完成吗？*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class t5_二叉树的中序遍历 {
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

   /* dfs
   public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
    public void dfs(TreeNode node,List<Integer> res){
        if(node==null)return;
        dfs(node.left,res);
        res.add(node.val);
        dfs(node.right,res);
    }*/

    //dfs迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        while (!stack.empty()||node!=null){
            while (node!=null){
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            res.add(node.val);
            node=node.right;
        }
        return res;
    }

}
