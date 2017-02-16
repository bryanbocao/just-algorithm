package ladders.USGiants.l8_SearchAndRecursion.num015_Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution_FromOther_BryanBCRevision_Practice {
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
/*
Note:
In line 22: lsls.add(new ArrayList<Integer>(ls));
Why not: ? lsls.add(ls);
如果是rst.add(list),你会看到最后的结果都是空，因为Java中所有对象都是引用，那么rst.add(list)以后，你在主程序你里继续操作修改list以后，由于list之前add进去是引用，那么rst里面的list对象也会被修改。所以我们add到rst的时候需要备份一下放进去，这样new ArrayList(list) 和 list就两个内容相同但是是不同的对象了，使得修改list不会影响到rst里面的内容。
 */
//PracticeOn20170216Thu 7Times