package LinkedList;

import java.util.Scanner;

class ListNode {
        
    int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }



public class Addtwolinkedlistwithcarry {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(1);
        ListNode ptr = head;
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum/10;
            ListNode temp = new ListNode(sum%10);
            ptr.next = temp;
            ptr = ptr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry > 0)
        {
            ListNode temp = new ListNode(carry);
            ptr.next = temp;
        }
        
        return head.next;
    }
    public static void display(ListNode l)
    {
        while(l != null)
        {
            System.out.print(l.val+" ");
            l = l.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length1 = in.nextInt();
        ListNode head1 = new ListNode(0);
        ListNode ptr1 = head1;
        while(length1>0)
        {
            ListNode temp = new ListNode(in.nextInt());
            ptr1.next = temp;
            ptr1 = ptr1.next;
            --length1;
        }

        int length2 = in.nextInt();
        ListNode head2 = new ListNode(0);
        ListNode ptr2 = head2;
        while(length2>0)
        {
            ListNode temp = new ListNode(in.nextInt());
            ptr2.next = temp;
            ptr2 = ptr2.next;
            --length2;
        }

        display(head1.next);
        display(head2.next);
        ListNode newnode = addTwoNumbers(head1.next, head2.next);
        display(newnode);

        in.close();
    }
}
