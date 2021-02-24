package QueueAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class a4_二叉树的最大深度 {

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

    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int max=0;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            while (size-->0){
                TreeNode node=queue.poll();
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
            max++;
        }
        return max;
    }

}
