package ladders.USGiants.l1_String.num013_strStr;

class Revised_Solution_FromOther {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
	public int strStr(String source, String target) {
		if (source == null || target == null) return -1;
		for (int i_s = 0; i_s <= source.length() - target.length(); i_s++)
			if (match(source, i_s, target)) return i_s;
		return -1;
	}
	private boolean match(String source, int i_s, String target) {
		for (int i_t = 0; i_t < target.length(); i_s++, i_t++)
			if (source.charAt(i_s) != target.charAt(i_t)) return false;
		return true;
	}
}

//https://www.lintcode.com/en/problem/strstr/
/*
strStr

Description
Notes
Testcase
Judge
For a given source string and a target string, you should output the first index(from 0) of target string in source string.

If target does not exist in source, just return -1.

Have you met this question in a real interview? Yes
Clarification
Do I need to implement KMP Algorithm in a real interview?

Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
Example
If source = "source" and target = "target", return -1.

If source = "abcdabcdefg" and target = "bcd", return 1.

Challenge 
O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)

Tags 
Basic Implementation String Facebook
Related Problems 
*/
//from http://codenuggets.com/lintcode/strstr