package ladders.USGiants.l8_SearchAndRecursion.num017_Subsets;

import java.util.*;

public class Solution_FromOther_BryanBCRevision {
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> lsLs = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.length == 0) return lsLs;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Arrays.sort(nums);
        subsetsHelper(lsLs, ls, nums, 0);
        return lsLs;
    }

    private void subsetsHelper(ArrayList<ArrayList<Integer>> lsLs, ArrayList<Integer> ls, int[] nums, int pos) {
        lsLs.add(new ArrayList<Integer>(ls));
        for (int i = pos; i < nums.length; i++) {
            ls.add(nums[i]);
            subsetsHelper(lsLs, ls, nums, i + 1);
            ls.remove(ls.size() - 1);
        }
    }
}
//http://www.lintcode.com/en/problem/subsets/
/*
Subsets

 Description
 Notes
 Testcase
 Judge
Given a set of distinct integers, return all possible subsets.

 Notice

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Have you met this question in a real interview? Yes
Example
If S = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
//From http://www.jiuzhang.com/solutions/subsets/
//PracticedOn20170224Fri 5Times