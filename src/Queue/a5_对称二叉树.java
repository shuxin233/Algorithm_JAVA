package Queue;
/*
对称二叉树
        给定一个二叉树，检查它是否是镜像对称的。

         

        例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

        1
        / \
        2   2
        / \ / \
        3  4 4  3
         

        但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

        1
        / \
        2   2
        \   \
        3    3
         

        进阶：

        你可以运用递归和迭代两种方法解决这个问题吗？*/


import java.util.*;

public class a5_对称二叉树 {

 public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(3);
        TreeNode node5=new TreeNode(4);
        TreeNode node6=new TreeNode(3);
        node.left=node1;
        node.right=node2;
       // node.left.left=node3;
        node.left.right=node4;
      //  node.right.left=node5;
        node.right.right=node6;
        System.out.println(isSymmetric(node));
    }

   /* public static boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        Map<Integer,Integer> map=new HashMap<>();
        while (!queue.isEmpty()){
            int size=queue.size();
            int len=1;
            while (size-- >0){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    map.put(len++,node.left.val);
                    queue.offer(node.left);
                }else {
                    map.put(len++,-1);
                }
                if(node.right!=null){
                    map.put(len++,node.right.val);
                    queue.offer(node.right);
                }else {
                    map.put(len++,-1);
                }
            }
            int i=1;
            len--;
            while (i<len){
                if(map.get(i++)!=map.get(len--))return false;
            }
            map.clear();
        }
        return true;
    }*/

    public static boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode root1=queue.poll();
            TreeNode root2=queue.poll();
            if(root1==null&&root2==null)continue;
            if ((root1 == null || root2 == null) || (root1.val != root2.val)) {
                return false;
            }
            queue.offer(root1.left);
            queue.offer(root2.right);

            queue.offer(root1.right);
            queue.offer(root2.left);
        }
        return true;
    }






}
