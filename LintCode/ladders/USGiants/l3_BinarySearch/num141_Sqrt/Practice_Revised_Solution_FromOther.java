package ladders.USGiants.l3_BinarySearch.num141_Sqrt;

class Practice_Revised_Solution_FromOther {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
//PracticedOn20170101 7times
//http://www.lintcode.com/en/problem/sqrtx/
/*
Sqrt(x)

Description
Notes
Testcase
Judge
Implement int sqrt(int x).

Compute and return the square root of x.

Have you met this question in a real interview? Yes
Example
sqrt(3) = 1

sqrt(4) = 2

sqrt(5) = 2

sqrt(10) = 3

Challenge 
O(log(x))

Tags 
Binary Search Mathematics Facebook
*/
//from https://discuss.leetcode.com/topic/8680/a-binary-search-solution/18
//from https://discuss.leetcode.com/user/yavinci