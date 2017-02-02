package ladders.USGiants.l8_SearchAndRecursion.num015_Permutations;

public class Solution_FromOther2_BryanBCRevision_NeedsUnderstood {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (int n : nums) {
            for (int size = res.size(); size > 0; size--) {
                List<Integer> r = res.pollFirst();
                for (int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new ArrayList<Integer>(r);
                    t.add(i, n);
                    res.add(t);
                }
            }
        }
        return res;
    }
}

//http://www.lintcode.com/en/problem/permutations/
/*
Permutations

 Description
 Notes
 Testcase
 Judge
Given a list of numbers, return all possible permutations.

 Notice

You can assume that there is no duplicate numbers in the list.

Have you met this question in a real interview? Yes
Example
For nums = [1,2,3], the permutations are:

[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
//From https://discuss.leetcode.com/topic/10812/share-my-short-iterative-java-solution
//Author https://discuss.leetcode.com/user/tusizi