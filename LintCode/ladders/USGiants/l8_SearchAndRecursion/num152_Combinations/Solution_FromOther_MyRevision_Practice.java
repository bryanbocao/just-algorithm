package ladders.USGiants.l8_SearchAndRecursion.num152_Combinations;

public class Solution_FromOther_MyRevision_Practice {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> combLsls = new ArrayList<List<Integer>>();
        combine(combLsls, new ArrayList<Integer>(), 1, n, k);
        return combLsls;
    }
    public static void combine(List<List<Integer>> combLsls, List<Integer> combLs, int start, int n, int k) {
        if (k == 0) {
            combLsls.add(new ArrayList<Integer>(combLs));
            return  ;
        }
        for (int i = start; i <= n; i++) {
            combLs.add(i);
            combine(combLsls, combLs, i + 1, n, k - 1);
            combLs.remove(combLs.size() - 1);
        }
    }
}
//http://www.lintcode.com/en/problem/combinations/
/*
Combinations

 Description
 Notes
 Testcase
 Judge
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

Have you met this question in a real interview? Yes
Example
For example,
If n = 4 and k = 2, a solution is:
[[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]

Tags
Backtracking Array
Related Problems
Medium N-Queens II 40 %
Medium N-Queens 24 %
*/
//From https://discuss.leetcode.com/topic/11718/backtracking-solution-java
//Author https://discuss.leetcode.com/user/fabrizio3
//PracticedOn20170212Sun5Times
