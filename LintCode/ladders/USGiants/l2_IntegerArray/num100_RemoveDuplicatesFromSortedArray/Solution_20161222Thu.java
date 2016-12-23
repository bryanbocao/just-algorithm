package ladders.USGiants.l2_IntegerArray.num100_RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class Solution_20161222Thu {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        Set<Integer> set = new HashSet<Integer>();
        int i = 0, len = nums.length, last_exchange_i = len - 1;
        while (i < last_exchange_i + 1) {
            if (set.contains(nums[i])) {
                int t = nums[i];
                nums[i] = nums[last_exchange_i];
                nums[last_exchange_i--] = t;
                len--;
            } else set.add(nums[i++]);
        }
        return len;
    }
}
//TriedOn20161222Thu CodingDuration:9m01s19 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao