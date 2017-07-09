package num014_LongestCommonPrefix;

public class Solution_FromOther_BryanBCRevision {
	public String longestCommonPrefix(String[] strs) {
        for (int i = 1; i < strs.length; i++) 
            while (strs[i].indexOf(strs[0]) != 0) 
                strs[0] = strs[0].substring(0, strs[0].length() - 1);
        return (strs.length == 0) ? "" : strs[0];
    }
}
/*
https://leetcode.com/problems/longest-common-prefix/#/description
Write a function to find the longest common prefix string amongst an array of strings.
*/
//From https://discuss.leetcode.com/topic/6987/java-code-with-13-lines
//Author https://discuss.leetcode.com/user/desmile