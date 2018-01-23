package prog;

public class AddTwoNumber {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// null check
        if (null == l1) return l2;
        if (null == l2) return l1;

        // create standby param node
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        // create result node and it's standby
        ListNode result = new ListNode(0);
        ListNode cur = result;

        int carry = 0;

        while (null != cur1 || null != cur2 || 1 == carry) {
            int sum = carry;

            if (null != cur1) {
                sum += cur1.val;
                cur1 = cur1.next;
            }
            if (null != cur2) {
                sum += cur2.val;
                cur2 = cur2.next;
            }

            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            cur.next = new ListNode(sum);
            cur = cur.next;
        }

        return result.next;
    }
	
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
