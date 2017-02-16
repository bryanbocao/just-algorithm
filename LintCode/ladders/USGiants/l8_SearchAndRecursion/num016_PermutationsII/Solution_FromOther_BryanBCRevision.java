package ladders.USGiants.l8_SearchAndRecursion.num016_PermutationsII;

import java.util.*;

class Solution_FromOther_BryanBCRevision {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lsls = new ArrayList<List<Integer>>();
        if (nums == null) return lsls;
        if (nums.length == 0) {
            lsls.add(new ArrayList<Integer>());
            return lsls;
        }
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        helper(lsls, ls, visited, nums);
        return lsls;
    }

    public void helper(List<List<Integer>> lsls, List<Integer> ls, boolean[] visited, int[] nums) {
        if (ls.size() == nums.length) {
            lsls.add(new ArrayList<Integer>(ls));
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]|| (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
            visited[i] = true;
            ls.add(nums[i]);
            helper(lsls, ls, visited, nums);
            ls.remove(ls.size() - 1);
            visited[i] = false;
        }
    }
}
//http://www.lintcode.com/en/problem/permutations-ii/
/*
Permutations II

 Description
 Notes
 Testcase
 Judge
Given a list of numbers with duplicate number in it. Find all unique permutations.

Have you met this question in a real interview? Yes
Example
For numbers [1,2,2] the unique permutations are:

[
  [1,2,2],
  [2,1,2],
  [2,2,1]
]
 */
//From http://www.jiuzhang.com/solutions/permutations-ii/
//PracticedOn20170216Thu 5Times