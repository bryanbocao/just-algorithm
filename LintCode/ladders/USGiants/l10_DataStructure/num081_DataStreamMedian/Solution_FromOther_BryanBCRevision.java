package ladders.USGiants.l10_DataStructure.num081_DataStreamMedian;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_FromOther_BryanBCRevision {

	public int[] medianII(int[] nums) {  
        if (nums == null) return null;  
        int[] res = new int[nums.length];
        if (nums.length == 0) return res;
          
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(1, new Comparator<Integer>() {  
            public int compare(Integer x, Integer y) {  
                return y - x;  
            }
        });  
        
        res[0] = nums[0];  
        maxHeap.add(nums[0]);  

        for (int i = 1; i < nums.length; i++) {  
            int currentMedian = maxHeap.peek();  
            if (nums[i] <= currentMedian) maxHeap.add(nums[i]);
            else minHeap.add(nums[i]);
            
            if (maxHeap.size() > minHeap.size()+1 ) minHeap.add(maxHeap.poll());  
            else if (maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll());  

            res[i] = maxHeap.peek();  
        }  
        return res;
    }
}
//http://www.lintcode.com/en/problem/data-stream-median/
/*
Data Stream Median

Description
Notes
Testcase
Judge
Numbers keep coming, return the median of numbers at every time a new number added.

Have you met this question in a real interview? Yes
Clarification
What's the definition of Median?
- Median is the number that in the middle of a sorted array. If there are n numbers in a sorted array A, the median is A[(n - 1) / 2]. For example, if A=[1,2,3], median is 2. If A=[1,19], median is 1.

Example
For numbers coming list: [1, 2, 3, 4, 5], return [1, 1, 2, 2, 3].

For numbers coming list: [4, 5, 1, 3, 2, 6, 0], return [4, 4, 4, 3, 3, 3, 3].

For numbers coming list: [2, 20, 100], return [2, 2, 20].

Challenge 
Total run time in O(nlogn).

Tags 
LintCode Copyright Heap Priority Queue Google
Related Problems 
Hard Sliding Window Median 19 %
Easy Median 23 %
Hard Median of two Sorted Arrays
*/
//From http://www.jiuzhang.com/solutions/median-in-data-stream/
//PracticedOn20170302Thu 5Times