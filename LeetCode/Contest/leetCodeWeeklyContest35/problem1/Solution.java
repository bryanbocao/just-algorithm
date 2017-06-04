package leetCodeWeeklyContest35.problem1;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	int len = flowerbed.length;
    	int[] arr = flowerbed;
    	if (len == 1 && arr[0] == 0 && n == 1) return true;
    	for (int i = 0; i < len; i++) {
    		if (i == 0 && arr[i] == 0 && i + 1 < len && arr[i + 1] == 0) n--;
    		else if (arr[i] == 0 && i + 1 < len && arr[i + 1] == 0 && i + 2 < len && arr[i + 2] == 0) {
    			n--;
    			i++;
    		} else if (i == len - 2 && arr[i] == 0 && arr[len - 1] == 0) n--;
    		if (n <= 0) return true;
    	}
    	return false;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-35/problems/can-place-flowers/
605. Can Place Flowers My SubmissionsBack To Contest
User Accepted: 1048
User Tried: 1181
Total Accepted: 1070
Total Submissions: 4038
Difficulty: Easy
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 */

/*
Input:
[1,0,1,0,1,0,1]
1
Output:
true
Expected:
false

Input:
[1,0,0,0,0,0,1]
2
Output:
false
Expected:
true

Input:
[0,0,1,0,0]
1
Output:
false
Expected:
true

[0,0,0,0,1]
2
Output:
false
Expected:
true

Input:
[0,0,0]
2
Output:
false
Expected:
true

Input:
[0,0,0,0,0,1,0,0]
0
Output:
false
Expected:
true
*/
//SolvedOn20170603Sat CodingDuration:32m21s81