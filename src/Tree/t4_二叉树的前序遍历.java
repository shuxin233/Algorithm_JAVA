package Tree;
/*
二叉树的前序遍历
        给你二叉树的根节点 root ，返回它节点值的 前序 遍历。*/

import java.util.*;

public class t4_二叉树的前序遍历 {

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

    /*dfs
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
    public static void dfs(TreeNode node,List<Integer> res){
        if(node==null)return ;
        res.add(node.val);
        dfs(node.left,res);
        dfs(node.right,res);
    }*/

    //dfs迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        while (!stack.isEmpty()||node!=null){
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            node=node.right;
        }
        return res;
    }


}
