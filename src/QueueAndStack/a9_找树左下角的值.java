package QueueAndStack;
/*513
给定一个二叉树，在树的最后一行找到最左边的值。

        示例 1:

        输入:

        2
        / \
        1   3

        输出:
        1
         

        示例 2:

        输入:

        1
        / \
        2   3
        /   / \
        4   5   6
        /
        7

        输出:
        7
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a9_找树左下角的值 {
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

    public int findBottomLeftValue(TreeNode root) {
        if(root==null)return root.val;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            list.clear();
            int size=queue.size();
            while (size-->0){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
        }
        return list.get(0);
    }

}
