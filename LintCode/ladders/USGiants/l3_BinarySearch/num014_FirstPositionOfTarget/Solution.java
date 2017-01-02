package ladders.USGiants.l3_BinarySearch.num014_FirstPositionOfTarget;

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int loI = 0, hiI = nums.length - 1, targetI = -1;
        while (true) {
            int midI = (loI + hiI) / 2;
            if (nums[midI] == target) {
                targetI = midI;
                break;
            } else if (nums[midI] < target) loI = midI + 1;
            else hiI = midI - 1;
            if (loI > hiI) {
                if (nums[midI] == target) {
                    targetI = midI;
                    break;
                } else return -1;
            }
        }
        while (targetI - 1 >= 0) {
            if (nums[targetI - 1] == nums[targetI]) targetI--;
            else break;
        }
        return targetI;
    }
}
//http://www.lintcode.com/en/problem/first-position-of-target/
/*
First Position of Target

Description
Notes
Testcase
Judge
For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.

If the target number does not exist in the array, return -1.

Have you met this question in a real interview? Yes
Example
If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.

Challenge 
If the count of numbers is bigger than 2^32, can your code work properly?

Tags 
Binary Search Array
*/
//SolvedOn20170101SunAt22:55 CodingDuration:10m08s66 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao