// Last updated: 26/09/2026, 22:39:29
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
13        // Base case: if array is empty or null
14        if (lists == null || lists.length == 0) {
15            return null;
16        }
17
18        // Start with the first list
19        ListNode result = lists[0];
20
21        // Merge each remaining list into the result one by one
22        for (int i = 1; i < lists.length; i++) {
23            result = mergeTwoLists(result, lists[i]);
24        }
25
26        return result;
27    }
28
29    // Standard helper method from LeetCode 21
30    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
31        ListNode dummy = new ListNode(0);
32        ListNode curr = dummy;
33
34        while (l1 != null && l2 != null) {
35            if (l1.val <= l2.val) {
36                curr.next = l1;
37                l1 = l1.next;
38            } else {
39                curr.next = l2;
40                l2 = l2.next;
41            }
42            curr = curr.next;
43        }
44
45        if (l1 != null) curr.next = l1;
46        if (l2 != null) curr.next = l2;
47        return dummy.next;
48    }
49}