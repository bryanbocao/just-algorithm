package leetCodeWeeklyContest58.problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


class Solution2 {
    public String countOfAtoms(String formula) {
        List<String> ls = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int len = formula.length(), i = 0;
        while (i < len) {
        	int j = i, iStartOfAtom = j;
        	if (j < len && Character.isUpperCase(formula.charAt(j))) j++;
        	if (j < len && Character.isLowerCase(formula.charAt(j))) j++;

        	String atom = formula.substring(iStartOfAtom, j);
            System.out.println("atom: " + atom);
        	
        	int iStartOfCnt = j;
        	while (j < len && Character.isDigit(formula.charAt(j))) j++;
        	String cntS = formula.substring(iStartOfCnt, j);
        	int cnt = cntS.equals("") ?  0 : Integer.parseInt(cntS);
        	
        	if (ls.contains(atom) && map.containsKey(atom)) map.put(atom, map.get(atom) + cnt);
        	else {
        		ls.add(atom);
        		map.put(atom, cnt);
        	}
        	
        	if (i == j) i++;
            else i = j;
        }
        
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
        	String atomS = it.next();
        	sb.append(atomS);
            int cnt = map.get(atomS);
            if (cnt > 0) sb.append(cnt);
        }
        return sb.toString();
    }
}