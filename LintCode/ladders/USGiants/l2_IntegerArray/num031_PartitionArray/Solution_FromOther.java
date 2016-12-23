package ladders.USGiants.l2_IntegerArray.num031_PartitionArray;

public class Solution_FromOther {
    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {

        int pl = 0;
        int pr = nums.length - 1;
        while (pl <= pr) {
            while (pl <= pr && nums[pl] < k) {
                pl++;
            }
            while (pl <= pr && nums[pr] >= k) {
                pr--;
            }
            if (pl <= pr) {
                swap(pl, pr, nums);
            }
        }
        return pl;
    }
}
//https://www.lintcode.com/en/problem/partition-array/
/*
Partition Array

Description
Notes
Testcase
Judge
Given an array nums of integers and an int k, partition the array (i.e move the elements in "nums") such that:

All elements < k are moved to the left
All elements >= k are moved to the right
Return the partitioning index, i.e the first index i nums[i] >= k.

Notice

You should do really partition in array nums instead of just counting the numbers of integers smaller than k.

If all elements in nums are smaller than k, then return nums.length

Have you met this question in a real interview? Yes
Example
If nums = [3,2,2,1] and k=2, a valid answer is 1.

Challenge 
Can you partition the array in-place and in O(n)?

Tags 
Two Pointers Sort Array
Related Problems 
Easy Partition Array by Odd and Even 40 %
Medium Interleaving Positive and Negative Numbers 22 %
Easy Partition List 31 %
*/
//from https://aaronice.gitbooks.io/lintcode/content/array/partition_array.html