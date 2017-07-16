package leetCodeWeeklyContest42.problem4;

import java.util.Iterator;
import java.util.List;

public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Iterator<String> it = dict.iterator();
        String s = sentence;
        while (it.hasNext()) {
        	String word = it.next();
        	int len = word.length();
        	for (int i = s.indexOf(word); i != -1 && i < s.length(); i = s.indexOf(word, i + 1)) {
                if (i > 0 && s.charAt(i - 1) != ' ') continue;
        		if (i + len < s.length() && s.charAt(i + len) != ' ') {
        			int i_space = s.indexOf(" ", i + len);
                    if (i_space == -1) s = s.substring(0, i + len);
                    else s = s.substring(0, i + len) + s.substring(i_space);
        		}
        	}
        }
        return s;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-42/problems/replace-words/
648. Replace Words My SubmissionsBack to Contest
User Accepted: 708
User Tried: 823
Total Accepted: 721
Total Submissions: 1517
Difficulty: Medium
In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Note:
The input will only have lower-case letters.
1 <= dict words number <= 1000
1 <= sentence words number <= 1000
1 <= root length <= 100
1 <= sentence words length <= 1000
 */
//SolvedOn20170723Sat CodingDuration:25m20s56
