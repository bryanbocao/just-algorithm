package num247_StrobogrammaticNumberII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_FromOther {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }

    List<String> helper(int n, int m) {
        if (n == 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));

        List<String> list = helper(n - 2, m);

        List<String> res = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if (n != m) res.add("0" + s + "0");

            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }

        return res;
    }
    
}
/*
https://leetcode.com/problems/strobogrammatic-number-ii
247. Strobogrammatic Number II
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Find all strobogrammatic numbers that are of length = n.

For example,
Given n = 2, return ["11","69","88","96"].

*/
//From https://discuss.leetcode.com/topic/20753/ac-clean-java-solution
//Author https://discuss.leetcode.com/user/jeantimex
//PracticedOn20170720Thu 5Times