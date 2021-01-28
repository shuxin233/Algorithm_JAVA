package LinkedList;

/*
回文链表
        请判断一个链表是否为回文链表。

        示例 1:

        输入: 1->2
        输出: false
        示例 2:

        输入: 1->2->2->1
        输出: true
        进阶：
        你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？*/


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
public class a5 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode a=new ListNode(1);
        head.next=a;
        ListNode b=new ListNode(1);
        a.next=b;
        ListNode c=new ListNode(2);
        b.next=c;
        ListNode d=new ListNode(1);
        c.next=d;
        System.out.println(isPalindrome(head));
        ListNode cur=reverseList(head);
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode head1=reverseList(head);
        while (head!=null){
            if(head.val!=head1.val)return false;
            System.out.println(head.val);
            System.out.println(head1.val);
            head=head.next;
            head1=head1.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur=null;
        ListNode pre=head;
        while (pre!=null){
            ListNode next=pre.next;
            pre.next=cur;
            cur=pre;
            pre=next;
        }
        return cur;
    }

}
