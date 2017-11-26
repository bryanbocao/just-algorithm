package leetCodeWeeklyContest60.problem2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        int len1 = words1.length, len2 = words2.length;
        if (len1 != len2) return false;
        for (int i = 0; i < pairs.length; i++) {
        	Set<String> s0;
        	if (map.containsKey(pairs[i][0])) s0 = map.get(pairs[i][0]);
        	else s0 = new HashSet<String>();
        	s0.add(pairs[i][1]);
        	map.put(pairs[i][0], s0);
        	
        	Set<String> s1;
        	if (map.containsKey(pairs[i][1])) s1 = map.get(pairs[i][1]);
        	else s1 = new HashSet<String>();
        	s1.add(pairs[i][0]);
        	map.put(pairs[i][1], s1);
        }
        
        for (int i = 0; i < len1; i++) {
            if (words1[i].equals(words2[i])) continue;
        	if (!map.containsKey(words1[i]) || !map.get(words1[i]).contains(words2[i]) || 
        			!map.containsKey(words2[i]) || !map.get(words2[i]).contains(words1[i])) return false;
        }
        return true;
    }
}
/*
https://leetcode.com/contest/weekly-contest-60/problems/sentence-similarity/
734. Sentence Similarity My SubmissionsBack to Contest
User Accepted: 1141
User Tried: 1293
Total Accepted: 1163
Total Submissions: 3283
Difficulty: Easy
Given two sentences words1, words2 (each represented as an array of strings), and a list of similar word pairs pairs, determine if two sentences are similar.

For example, "great acting skills" and "fine drama talent" are similar, if the similar word pairs are pairs = [["great", "fine"], ["acting","drama"], ["skills","talent"]].

Note that the similarity relation is not transitive. For example, if "great" and "fine" are similar, and "fine" and "good" are similar, "great" and "good" are not necessarily similar.

Also, a word is always similar with itself. For example, the sentences words1 = ["great"], words2 = ["great"], pairs = [] are similar, even though there are no specified similar word pairs.

Finally, sentences can only be similar if they have the same number of words. So a sentence like words1 = ["great"] can never be similar to words2 = ["doubleplus","good"].

Note:

The length of words1 and words2 will not exceed 1000.
The length of pairs will not exceed 2000.
The length of each pairs[i] will be 2.
The length of each words[i] and pairs[i][j] will be in the range [1, 20].
*/
//SolvedOn20171125Sat