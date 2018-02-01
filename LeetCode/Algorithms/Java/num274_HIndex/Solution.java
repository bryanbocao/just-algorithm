package num274_HIndex;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length, h = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            int cnt = 0, ci = citations[i];
            if (citations[i] == 0 || set.contains(ci)) continue;
            for (int j = 0; j < len; j++) {
                if (citations[j] >= ci)
                    cnt++;
                if (cnt >= ci) break;
            }
            if (cnt > h) h = cnt;
            set.add(ci);
        }
        return h;
    }
}
/*
https://leetcode.com/problems/h-index/description/
274. H-Index
DescriptionHintsSubmissionsDiscussSolution
Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

For example, given citations = [3, 0, 6, 1, 5], which means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively. Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, his h-index is 3.

Note: If there are several possible values for h, the maximum one is taken as the h-index.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
//SolvedOn20180131Wed CodingDuration:25m22s89