

class Solution {

    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        // Store values
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // Reverse values
        Collections.reverse(list);

        // Create new linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}