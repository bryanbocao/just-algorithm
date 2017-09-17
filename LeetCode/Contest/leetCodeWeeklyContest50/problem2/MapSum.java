package leetCodeWeeklyContest50.problem2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapSum {

    /** Initialize your data structure here. */
    Map<String, Integer> map;
    public MapSum() {
        this.map = new HashMap<String, Integer>();
    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String prefix) {
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        int sum = 0;
        while (it.hasNext()) {
            String key = it.next();
            if (key.startsWith(prefix)) sum += map.get(key);
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */

/*
https://leetcode.com/contest/leetcode-weekly-contest-50/problems/map-sum-pairs/
677. Map Sum Pairs My SubmissionsBack to Contest
User Accepted: 1384
User Tried: 1495
Total Accepted: 1395
Total Submissions: 2617
Difficulty: Medium
Implement a MapSum class with insert, and sum methods.

For the method insert, you'll be given a pair of (string, integer). The string represents the key and the integer represents the value. If the key already existed, then the original key-value pair will be overridden to the new one.

For the method sum, you'll be given a string representing the prefix, and you need to return the sum of all the pairs' value whose key starts with the prefix.

Example 1:
Input: insert("apple", 3), Output: Null
Input: sum("ap"), Output: 3
Input: insert("app", 2), Output: Null
Input: sum("ap"), Output: 5
 */
//SolvedOn20170916SatNight CodingDuration:7m49s85