package ladders.USGiants.l8_SearchAndRecursion.num018_SubsetsII;

import java.util.*;

public class Solution_FromOther_BryanBCRevision {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<ArrayList<Integer>> lsLs = new ArrayList<>();
        if (nums == null || nums.length == 0) return lsLs;
        Arrays.sort(nums);
        ArrayList<Integer> ls = new ArrayList<>();
        helper(lsLs, ls, nums, 0);
        return lsLs;
    }
    
    private void helper(ArrayList<ArrayList<Integer>> lsLs, ArrayList<Integer> ls, int[] nums, int pos){
        lsLs.add(new ArrayList<Integer>(ls));
        for (int i = pos; i < nums.length; i++){
            if (i > pos && nums[i] == nums[i - 1]) continue;
            ls.add(nums[i]);
            helper(lsLs, ls, nums, i + 1);
            ls.remove(ls.size() - 1);
        }
    }
}
//http://www.lintcode.com/en/problem/subsets-ii/
/*
Subsets II

Description
Notes
Testcase
Judge
Given a list of numbers that may has duplicate numbers, return all possible subsets

Notice

Each element in a subset must be in non-descending order.
The ordering between two subsets is free.
The solution set must not contain duplicate subsets.
Have you met this question in a real interview? Yes
Example
If S = [1,2,2], a solution is:

[
[2],
[1],
[1,2,2],
[2,2],
[1,2],
[]
]
*/
//From http://www.jiuzhang.com/solutions/subsets-ii/
//PracticedOn20170224Fri 5Times