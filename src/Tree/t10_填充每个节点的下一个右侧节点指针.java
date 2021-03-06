package Tree;
/*
填充每个节点的下一个右侧节点指针
        给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

        struct Node {
        int val;
        Node *left;
        Node *right;
        Node *next;
        }
        填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

        初始状态下，所有 next 指针都被设置为 NULL。

        输入：root = [1,2,3,4,5,6,7]
        输出：[1,#,2,3,#,4,5,6,7,#]
        解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。序列化的输出按层序遍历排列，同一层节点由 next 指针连接，'#' 标志着每一层的结束。
*/

import java.util.LinkedList;
import java.util.Queue;

public class t10_填充每个节点的下一个右侧节点指针 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

  /*  bfs迭代

  public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                Node node=queue.poll();
                if(i<size-1)node.next=queue.peek();
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }

           *//* while (size-->0){
                Node node=queue.poll();
                if(size>1)node.next=queue.peek();
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }*//*
        }
        return root;
    }*/


    public Node connect(Node root) {
        dfs(root,null);
       return root;
    }
    public void dfs(Node node,Node next){
        if(node != null) {
            node.next = next;
            dfs(node.left, node.right);
            dfs(node.right, node.next != null ? node.next.left : null);
        }
    }


}
