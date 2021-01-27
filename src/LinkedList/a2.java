package LinkedList;
/*
删除链表的倒数第N个节点
        给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

        进阶：你能尝试使用一趟扫描实现吗？

         

        示例 1：


        输入：head = [1,2,3,4,5], n = 2
        输出：[1,2,3,5]
        示例 2：

        输入：head = [1], n = 1
        输出：[]
        示例 3：

        输入：head = [1,2], n = 1
        输出：[1]
         

        提示：

        链表中结点的数目为 sz
        1 <= sz <= 30
        0 <= Node.val <= 100
        1 <= n <= sz*/

public class a2 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

   /* public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0,head);
        ListNode first=head;
        ListNode second=dummy;
        for (int i = 0; i <n ; i++) {
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }*/
   public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0, head);
       int length = getLength(head);
       ListNode cur = dummy;
       for (int i = 1; i < length - n + 1; ++i) {
           cur = cur.next;
       }
       cur.next = cur.next.next;
       ListNode ans = dummy.next;
       return ans;
   }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

}
