package algorithms.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class FunnyString20160606Mon1807 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			String str = scn.next();
			char[] cs1 = str.substring(0, str.length() / 2).toCharArray(),
					cs2 = str.substring(str.length() / 2, str.length() / 2).toCharArray();
			Map<Character, Integer> map1 = new HashMap<Character, Integer>(),
					map2 = new HashMap<Character, Integer>();
			int diff = cs1.length - cs2.length;
			for (int j = 0; j < cs1.length; j++) {
				if(map1.containsKey(cs1[j])) map1.put(cs1[j],	map1.get(cs1[j]) + 1);
				else map1.put(cs1[j], 1);
			}
			for (int j = 0; j < cs2.length; j++) {
				if(map2.containsKey(cs2[j])) map2.put(cs2[j],	map2.get(cs2[j]) + 1);
				else map2.put(cs2[j], 1);
			}
			
			if (diff == 1) {
				int ks1 = map1.keySet().size(),
						ks2 = map2.keySet().size();
				if (ks2 - ks1 > 0) {
					System.out.println(-1);
				} else {
					
				}
			} else if (diff == 0) {
				
			}
		}
	}

}

//37m20s95 20160520Fri
