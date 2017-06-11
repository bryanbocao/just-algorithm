package leetCodeWeeklyContest36.problem2;

public class StringIterator {
    
    int len, i;
    int[] cnts;
    char[] cs;

    public StringIterator(String compressedString) {
    	String s = compressedString;
        this.len = compressedString.length();
        int i = 0, i_cs = 0, i_cnts = 0;
        this.cnts = new int[len];
        this.cs = new char[len];
        while (i < len) {
        	char c = s.charAt(i);
        	if (Character.isLetter(c)) {
        	    cs[i_cs++] = c;
        	    i++;
        	} else {
        		int digit_start_i = i;
        		while (i < len && Character.isDigit(s.charAt(i))) i++;
        		int digit_end_i = i;
        		cnts[i_cnts++] = Integer.valueOf(s.substring(digit_start_i, digit_end_i));
        	}
        }
        this.i = 0;
    }
    
    public char next() {
        if (hasNext()) {
            if (cnts[i] > 0) {
            	cnts[i]--;
            	if (cnts[i] <= 0) {
            		i++;
            		return cs[i - 1];
            	}
            	return cs[i];
            }
        }
        return ' ';
    }
    
    public boolean hasNext() {
        if (this.i < len && cnts[i] > 0) return true;
        return false;
    }
}
/*
Input:
["StringIterator","next","next","next","next","next","next","hasNext","next","hasNext"]
[["L10e2t1C1o1d1e11"],[],[],[],[],[],[],[],[],[]]
Output:
[null,'L','0','0','0','0','0',true,'0',true]
Expected:
[null,'L','L','L','L','L','L',true,'L',true]

Input:
["StringIterator","next","next","next","hasNext","next","next","next","next","next","next","next","hasNext","next","next","next","next","next","hasNext","next","next","next","next","next","hasNext","next","next","next","next","hasNext","next","next","next","next","next","next","next","next","next","next","next","next","next","next","next","next","next","next","next","hasNext","next","hasNext","next","next","next","next","next","next","hasNext","next","next","next","next","next","next","next","next","next","next","next","next","next","next","hasNext","next","next","next","hasNext","next","next","hasNext","next","next","next","next","next"]
[["x6"],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[]]
Output:
[null,'x','x','x',true,'x','x','x',' ',' ',' ',' ',true,' ',' ',' ',' ',' ',true,' ',' ',' ',' ',' ',true,' ',' ',' ',' ',true,' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',true,' ',true,' ',' ',' ',' ',' ',' ',true,' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',true,' ',' ',' ',true,' ',' ',true,' ',' ',' ',' ',' ']
Expected:
[null,'x','x','x',true,'x','x','x',' ',' ',' ',' ',false,' ',' ',' ',' ',' ',false,' ',' ',' ',' ',' ',false,' ',' ',' ',' ',false,' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',false,' ',false,' ',' ',' ',' ',' ',' ',false,' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',false,' ',' ',' ',false,' ',' ',false,' ',' ',' ',' ',' ']
*/
//SolvedOn20170610Sat CodingDuration:1h10m51s45