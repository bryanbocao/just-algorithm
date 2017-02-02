package ladders.USGiants.l8_SearchAndRecursion.num015_Permutations;

import java.util.*;

public class Solution_FromOther_BryanBCRevision {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lsls = new ArrayList<List<Integer>>();
        if (nums == null) return lsls;

        if (nums.length == 0) {
            lsls.add(new ArrayList<Integer>());
            return lsls;
        }

        List<Integer> ls = new ArrayList<Integer>();
        helper(lsls, ls, nums);
        return lsls;
    }

    public void helper(List<List<Integer>> lsls, List<Integer> ls, int[] nums){
        if (ls.size() == nums.length) {
            lsls.add(new ArrayList<Integer>(ls)); //Why not lsls.add(ls); ?
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if (ls.contains(nums[i])) continue;
            ls.add(nums[i]);
            helper(lsls, ls, nums);
            ls.remove(ls.size() - 1);
        }

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
//From http://www.jiuzhang.com/solutions/permutations/