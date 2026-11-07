class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create dummy node
        ListNode dummy = new ListNode(0);

        // Pointer to build merged list
        ListNode curr = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {

            // Compare values
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } 
            else {
                curr.next = list2;
                list2 = list2.next;
            }

            // Move current pointer
            curr = curr.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            curr.next = list1;
        } 
        else {
            curr.next = list2;
        }

        // Return actual head
        return dummy.next;
    }
}