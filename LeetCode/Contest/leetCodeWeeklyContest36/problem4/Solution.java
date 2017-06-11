package leetCodeWeeklyContest36.problem4;

public class Solution {
    public String addBoldTag(String s, String[] dict) {
        int len = s.length();
        boolean[] bArr = new boolean[len];
        for (int i = 0; i < dict.length; i++) {
            String word = dict[i];
            int offset = 0;
            while (s.substring(offset).contains(word)) {
                int iS = s.substring(offset).indexOf(word) + offset;
                int iE = iS + word.length() < len ? iS + word.length() : len;
                for (int j = iS; j < iE; j++) bArr[j] = true;
                offset++;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        int i = 0;
        while (i < bArr.length) {
        	if (b) {
        		if (!bArr[i]) {
        			sb.append("</b>");
        			b = false;
        		}
        	} else {
        		if (bArr[i]) {
        			sb.append("<b>");
        			b = true;
        		}
        	}
        	sb.append(s.charAt(i));
        	i++;
        }
        if (i == bArr.length && b) sb.append("</b>");
        return sb.toString();
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-36/problems/add-bold-tag-in-string/
616. Add Bold Tag in String My SubmissionsBack To Contest
User Accepted: 198
User Tried: 289
Total Accepted: 202
Total Submissions: 687
Difficulty: Medium
Given a string s and a list of strings dict, you need to add a closed pair of bold tag <b> and </b> to wrap the substrings in s that exist in dict. If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag. Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.

Example 1:
Input: 
s = "abcxyz123"
dict = ["abc","123"]
Output:
"<b>abc</b>xyz<b>123</b>"
Example 2:
Input: 
s = "aaabbcc"
dict = ["aaa","aab","bc"]
Output:
"<b>aaabbc</b>c"
Note:
The given dict won't contain duplicates, and its length won't exceed 100.
All the strings in input have length in range [1, 1000].
*/
//SolvedOn20170611Sun CodingDuration:24m57s05