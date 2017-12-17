package leetCodeWeeklyContest63.problem2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        List<Character> ls = new ArrayList<Character>();
        String lp = licensePlate.toLowerCase();
        for (int i = 0; i < lp.length(); i++) {
            char c = lp.charAt(i);
            if (Character.isLetter(c)) ls.add(c);
        }
        
        String s_word = new String();
        for (int i = 0; i < words.length; i++) {
        	words[i] = words[i].toLowerCase();
        	List<Character> ls_t = new ArrayList<Character>(ls);
        	for (int j = 0; j < words[i].length(); j++) {
        		char c = words[i].charAt(j);
        		if (ls_t.contains(c)) ls_t.remove(c);
        		if (ls_t.isEmpty()) break;
        	}
        	if (ls_t.isEmpty()) {
        		if (s_word.isEmpty() || words[i].length() < s_word.length())
        			s_word = words[i];
        	}
        }
        
        return s_word;
        
    }
}
/*
https://leetcode.com/contest/weekly-contest-63/problems/shortest-completing-word/
748. Shortest Completing Word My SubmissionsBack to Contest
User Accepted: 183
User Tried: 221
Total Accepted: 185
Total Submissions: 274
Difficulty: Easy
Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate

Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does.

Example 1:
Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
Output: "step"
Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
Note that the answer is not "step", because the letter "s" must occur in the word twice.
Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
Example 2:
Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
Output: "pest"
Explanation: There are 3 smallest length words that contains the letters "s".
We return the one that occurred first.
Note:
licensePlate will be a string with length in range [1, 7].
licensePlate will contain digits, spaces, or letters (uppercase or lowercase).
words will have a length in the range [10, 1000].
Every words[i] will consist of lowercase letters, and have length in range [1, 15].
*/
//SolvedOn20171216SatNight CodingDuration:13m07s11