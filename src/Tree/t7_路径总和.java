package Tree;
/*路径总和
        给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。

        叶子节点 是指没有子节点的节点。



        提示：

        树中节点的数目在范围 [0, 5000] 内
        -1000 <= Node.val <= 1000
        -1000 <= targetSum <= 1000*/


public class t7_路径总和 {
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



    public boolean hasPathSum(TreeNode root, int targetSum) {
         if (root==null)return false;
         return dfs(root,0,targetSum);
    }
    public boolean dfs(TreeNode node,int res,int target){
         if (node==null)return false;
         if(node.left==null&&node.right==null) return res+node.val==target;
         res+=node.val;
         return dfs(node.left,res,target)||dfs(node.right,res,target);
    }

}
