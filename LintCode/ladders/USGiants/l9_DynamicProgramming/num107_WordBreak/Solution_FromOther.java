package ladders.USGiants.l9_DynamicProgramming.num107_WordBreak;

public class Solution_FromOther {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;

        /* First DP
        for(int i = 1; i <= s.length(); i++){
            for(String str: wordDict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }*/

        //Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }
}
//http://www.lintcode.com/en/problem/word-break/
/*
Word Break

 Description
 Notes
 Testcase
 Judge
Given a string s and a dictionary of words dict, determine if s can be break into a space-separated sequence of one or more dictionary words.

Have you met this question in a real interview? Yes
Example
Given s = "lintcode", dict = ["lint", "code"].

Return true because "lintcode" can be break as "lint code".
*/
//From https://discuss.leetcode.com/topic/6156/java-implementation-using-dp-in-two-ways
//Author https://discuss.leetcode.com/user/segfault