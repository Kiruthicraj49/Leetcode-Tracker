// Last updated: 26/09/2026, 22:40:51
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        if (lists == null || lists.length == 0) {
14            return null;
15        }
16        ListNode result = lists[0];
17        for (int i = 1; i < lists.length; i++) {
18            result = mergeTwoLists(result, lists[i]);
19        }
20
21        return result;
22    }
23    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
24        ListNode dummy = new ListNode(0);
25        ListNode curr = dummy;
26        while (l1 != null && l2 != null) {
27            if (l1.val <= l2.val) {
28                curr.next = l1;
29                l1 = l1.next;
30            } else {
31                curr.next = l2;
32                l2 = l2.next;
33            }
34            curr = curr.next;
35        }
36        if (l1 != null) curr.next = l1;
37        if (l2 != null) curr.next = l2;
38        return dummy.next;
39    }
40}