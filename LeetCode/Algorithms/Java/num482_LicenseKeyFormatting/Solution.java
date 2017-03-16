package com.num482_LicenseKeyFormatting;

public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        if (S == null || S.length() == 0) return "";
        String[] ss = S.split("-");
        StringBuilder sb = new StringBuilder();
        for (String s : ss) sb.append(s);
        String noDashS = sb.toString();
        sb = new StringBuilder();
        int firstK = noDashS.length() % K;
        if (firstK == 0) firstK = K;
        for (int i = 0; i < noDashS.length();) {
            if (i == 0) {
                if (i + firstK < noDashS.length()) sb.append(noDashS.substring(i, i + firstK));
                else sb.append(noDashS.substring(i, noDashS.length()));
                i += firstK;
                continue;
            } else if (i + K < noDashS.length()) sb.append("-" + noDashS.substring(i, i + K));
            else sb.append("-" + noDashS.substring(i, noDashS.length()));
            i += K;
        }
        return sb.toString().toUpperCase();
    }
}
//SolvedOn20170316Thu CodingDuration:20m57s53