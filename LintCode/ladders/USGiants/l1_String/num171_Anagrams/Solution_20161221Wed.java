package ladders.USGiants.l1_String.num171_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution_20161221Wed {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> ls = new ArrayList<String>();
        if (strs.length <= 1) return ls;
        Set<Set> set = new HashSet<Set>();
        Map<Set, String> first_word_map = new HashMap<Set, String>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) ls.add(strs[i]);
            else {
                Set<Character> wordSet = new HashSet<Character>();
                char[] cs = strs[i].toCharArray();
                for (int j = 0; j < cs.length; j++) wordSet.add(cs[j]);
                if (set.contains(wordSet)) {
                    ls.add(strs[i]);
                    String first_word = first_word_map.get(wordSet);
                    if (!first_word.equals("-1")) {
                        ls.add(first_word);
                        first_word_map.put(wordSet, "-1");
                    }
                } else {
                    first_word_map.put(wordSet, strs[i]);
                    set.add(wordSet);
                }
            }
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

//TriedOn2061221Wed CodingDuration:33m03s17 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
/*
Wrong Answer


Total Runtime: 1422 ms
64% test cases passed.
Input  Input Data
["compilations","bewailed","horology","lactated","blindsided","swoop","foretasted","ware","abuts","stepchild","arriving","magnet","vacating","relegates","scale","melodically","proprietresses","parties","ambiguities","bootblacks","shipbuilders","umping","belittling","lefty","foremost","bifocals","moorish","temblors","edited","hint","serenest","rendezvousing","schoolmate","fertilizers","daiquiri","starr","federate","rectal","case","kielbasas","monogamous","inflectional","zapata","permitted","concessions","easters","communique","angelica","shepherdess","jaundiced","breaks","raspy","harpooned","innocence","craters","cajun","pueblos","housetop","traits","bluejacket","pete","snots","wagging","tangling","cheesecakes","constructing","balanchine","paralyzed","aftereffects","dotingly","definitions","renovations","surfboards","lifework","knacking","apprises","minimalism","skyrocketed","artworks","instrumentals","eardrums","hunching","codification","vainglory","clarendon","peters","weeknight","statistics","ay","aureomyci ...
Output
["apprises","ardent","assessments","compilations","complainants","edit","edited","emits","lactated","lactated","overjoying","overjoying","persia","ranted","repackage","repackage","semite","stiflings","stiflings","tamed","tameness","teamed","tramps","tramps"]
Expected
["ardent","lactated","lactated","overjoying","overjoying","ranted","repackage","repackage","stiflings","stiflings","tramps","tramps"]
*/
