package algorithms.num220_ContainsDuplicateIII;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (Math.abs((long)nums[j] - (long)nums[i]) <= t && j - i <= k) return true;
        	}
        }
        return false;
    }
}