package num246_StrobogrammaticNumber;

public class Solution {
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        if (num == null || len == 0) return true;
        else {
            int mid = len / 2;
            for (int i = 0; i <= mid; i++) {
                int i_e = len - 1 - i;
                char c = num.charAt(i), c_e = num.charAt(i_e);
                switch (c) {
                    case '0':
                        if (c_e != '0') return false;
                        break;
                    case '1':
                        if (c_e != '1') return false;
                        break;
                    case '6':
                        if (c_e != '9') return false;                        
                        break;
                    case '8':
                        if (c_e != '8') return false;                        
                        break;
                    case '9':
                        if (c_e != '6') return false;                        
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
    }
}
/*
https://leetcode.com/problems/strobogrammatic-number
246. Strobogrammatic Number
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

For example, the numbers "69", "88", and "818" are all strobogrammatic.
*/
//SolvedOn20170720Thu CodingDuration:8m21s60 github.com/BryanBo-Cao
