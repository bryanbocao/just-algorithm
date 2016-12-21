package ladders.USGiants.l1_String.num171_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_FromOther {
	/**
	 * @param strs:
	 *            A list of strings
	 * @return: A list of strings
	 */
	public List<String> anagrams(String[] strs) {
		// write your code here
		// split the original string and sort.
		// note the usage of Map.Entry
		List<String> res = new ArrayList<String>();
		Map<String, List<String>> dict = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ss = s.toCharArray();
			Arrays.sort(ss);
			String tempString = new String(ss);
			if (!dict.containsKey(tempString)) {
				dict.put(tempString, new ArrayList<String>());
			}
			dict.get(tempString).add(s);
		}
		for (Map.Entry<String, List<String>> entry : dict.entrySet()) {
			if (entry.getValue().size() > 1) {
				res.addAll(entry.getValue());
			}
		}

		return res;
	}
}
//https://www.lintcode.com/en/problem/anagrams/
/*
Anagrams

Description
Notes
Testcase
Judge
Given an array of strings, return all groups of strings that are anagrams.

Notice

All inputs will be in lower-case

Have you met this question in a real interview? Yes
Example
Given ["lint", "intl", "inlt", "code"], return ["lint", "inlt", "intl"].

Given ["ab", "ba", "cd", "dc", "e"], return ["ab", "ba", "cd", "dc"].

Challenge 
What is Anagram?
- Two strings are anagram if they can be the same after change the order of characters.

Tags 
String Hash Table Facebook Uber
Related Problems 
Easy Two Strings Are Anagrams
*/
//Solution from https://github.com/shogunsea/lintcode/blob/master/anagrams.java