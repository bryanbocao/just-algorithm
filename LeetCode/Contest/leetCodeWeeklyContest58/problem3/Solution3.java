package leetCodeWeeklyContest58.problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Solution3 {
    public String countOfAtoms(String formula) {
        List<String> ls = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int len = formula.length(), bNum = 1, i = 0;
        while (i < len) {
            
            if (formula.charAt(i) == '(') {
                int currentBNum = getCurrentBNum(formula, i);
                bNum *= currentBNum;
                i++;
            } else if (formula.charAt(i) == ')') {
                int currentBNumStartI = i + 1, j = currentBNumStartI;
                while (j < len && Character.isDigit(formula.charAt(j))) j++;
                String currentBNumS = formula.substring(currentBNumStartI, j);
                int currentBNum = Integer.parseInt(currentBNumS);
                bNum /= currentBNum;
                i++;
            } else {
                int j = i, iStartOfAtom = j;
                if (j < len && Character.isUpperCase(formula.charAt(j))) j++;
                if (j < len && Character.isLowerCase(formula.charAt(j))) j++;
                
                if (iStartOfAtom < j) {
                    String atom = formula.substring(iStartOfAtom, j);
                    System.out.println("atom: " + atom);
                    System.out.println("bNum: " + bNum);

                    int iStartOfCnt = j;
                    System.out.println("iStartOfCnt: " + iStartOfCnt);
                    while (j < len && Character.isDigit(formula.charAt(j))) j++;
                    System.out.println("j: " + j);
                    String cntS = formula.substring(iStartOfCnt, j);
                    int cnt = cntS.equals("") ? 1 : Integer.parseInt(cntS);
                    cnt *= bNum;
                    System.out.println("cnt: " + cnt);

                    if (ls.contains(atom) && map.containsKey(atom)) map.put(atom, map.get(atom) + cnt);
                    else {
                        ls.add(atom);
                        map.put(atom, cnt);
                    }
                    
                }
                
                if (i == j) i++;
                else i = j;
                
            }
            
        }
        
        return fToString(formula, ls, map);
    }
    
    private static int getCurrentBNum(String formula, int lBI) {
        int len = formula.length(), lBCnt = 0, rBI = -1;
        for (int i = lBI; i < len; i++) {
            if (formula.charAt(i) == '(') lBCnt++;
            else if (formula.charAt(i) == ')') lBCnt--;
            if (lBCnt == 0) {
                rBI = i;
                break;
            }
        }
        int bNumStartI = rBI + 1, i = bNumStartI;
        while (i < len && Character.isDigit(formula.charAt(i))) i++;
        String bNumS = formula.substring(bNumStartI, i);
        int bNum = Integer.parseInt(bNumS);
        
        return bNum;
    }
    
    private static String fToString(String fml, List<String> ls, Map<String, Integer> map) {
        Collections.sort(ls);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
        	String atomS = it.next();
            System.out.println("atomS: " + atomS);
        	sb.append(atomS);
            int cnt = map.get(atomS);
            if (cnt > 1) sb.append(cnt);
        }
        return sb.toString();
    }
}