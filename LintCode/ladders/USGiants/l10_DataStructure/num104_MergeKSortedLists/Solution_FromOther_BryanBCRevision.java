package ladders.USGiants.l10_DataStructure.num104_MergeKSortedLists;

public class Solution_FromOther_BryanBCRevision {

    public static ListNode mergeKLists(List<ListNode> lists) {
        return partion(lists,0,lists.size() - 1);
    }

    private static ListNode partion(List<ListNode> lists, int s, int e) {
        if (s == e)  return lists.get(s);
        if (s < e) {
            int q = (s + e) / 2;
            ListNode l1 = partion(lists, s, q);
            ListNode l2 = partion(lists,q + 1, e);
            return merge(l1, l2);
        } else return null;
    }
    //This function is from Merge Two Sorted Lists.
    private static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
//http://www.lintcode.com/en/problem/merge-k-sorted-lists/
/*
Merge k Sorted Lists

 Description
 Notes
 Testcase
 Judge
Merge k sorted linked lists and return it as one sorted list.

Analyze and describe its complexity.

Have you met this question in a real interview? Yes
Example
Given lists:

[
  2->4->null,
  null,
  -1->null
],
return -1->2->4->null.
 */
//From https://discuss.leetcode.com/topic/26095/my-simple-java-solution-use-recursion
//Author https://discuss.leetcode.com/user/mouqi123
//PracticedOn20170216Thu 5Times
