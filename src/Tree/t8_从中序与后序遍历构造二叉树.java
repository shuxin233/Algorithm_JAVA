package Tree;

import java.util.HashMap;

public class t8_从中序与后序遍历构造二叉树 {
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

    HashMap<Integer,Integer> memo = new HashMap<>();
    int[] post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0;i < inorder.length; i++) memo.put(inorder[i], i);
        post = postorder;
        TreeNode root = dfs(0, inorder.length - 1, 0, post.length - 1);
        return root;
    }
    public TreeNode dfs(int il,int ir,int pl,int pr){
        if(ir<il||pr<pl)return null;
        TreeNode node=new TreeNode(post[pr]);
        int mi=memo.get(post[pr]);
        node.left=dfs(il,mi-1,pl,pl+mi-il-1);
        node.right=dfs(mi+1,ir,mi+pl-il,pr-1);
        return node;
    }

}
