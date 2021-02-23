package Queue;
/*
二叉树的层序遍历
        给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。

         

        示例：
        二叉树：[3,9,20,null,null,15,7],

        3
        / \
        9  20
        /  \
        15   7
        返回其层序遍历结果：

        [
        [3],
        [9,20],
        [15,7]
        ]

*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a6_二叉树的层序遍历 {

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            while (size-->0){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
            lists.add(list);
        }
        return lists;
    }
}
