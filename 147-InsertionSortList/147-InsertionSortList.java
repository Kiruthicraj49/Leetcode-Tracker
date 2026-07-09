// Last updated: 09/07/2026, 15:08:22
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode ans = new ListNode(0);
        while(head != null){
            ListNode temp = ans;
            while(temp.next != null && temp.next.val < head.val){
                temp = temp.next;
            }
            ListNode next = head.next;
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        return ans.next;
    }
}