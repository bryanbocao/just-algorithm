package ladders.USGiants.l1_String.num171_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> ls = new ArrayList<String>();
        if (strs.length <= 1) return ls;
        Map<String, List<String>> word_Map = new HashMap<String, List<String>>();
        for (String s : strs) {
        	char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String temp_s = new String(cs);
            if (!word_Map.containsKey(temp_s)) word_Map.put(temp_s, new ArrayList<String>());
            word_Map.get(temp_s).add(s);
        }
        Iterator<String> it = word_Map.keySet().iterator();
        while (it.hasNext()) {
        	String word = it.next();
        	List<String> word_Ls = word_Map.get(word);
        	if (word_Ls.size() >= 1) ls.addAll(word_Ls);
        }
        return ls;
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

//SolvedOn2061221Wed CodingDuration:8m14s95 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao