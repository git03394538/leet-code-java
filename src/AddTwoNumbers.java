/**
 * Linked List
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        l1.val = 9;
        return dummyHead.next;
    }

    public static void main (String args[]) {
        ListNode l111 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        l11.next = l111;
        ListNode l1 = new ListNode(3);
        l1.next = l11;

        ListNode l222 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l22.next = l222;
        ListNode l2 = new ListNode(4);
        l2.next = l22;


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode a = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
