package worldCodeSprintApril;
import java.io.*;
import java.util.*;

public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), d = scanner.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			intList.add(scanner.nextInt());
		}
		int beautyCount = 0;
		Iterator<Integer> iterator = intList.iterator();
		while (iterator.hasNext()) {
			int a = iterator.next();
			if (intList.contains(a + d) && intList.contains(a + d * 2)) {
				beautyCount++;
			}
		}
		
		System.out.println(beautyCount);
	}

}

/*

Erica wrote an increasing sequence of nn numbers (a0,a1,…,an−1a0,a1,…,an−1) in her notebook. She considers a triplet (ai,aj,ak)(ai,aj,ak) to be beautiful if:

i<j<ki<j<k
a[j]−a[i]=a[k]−a[j]=da[j]−a[i]=a[k]−a[j]=d
Given the sequence and the value of dd, can you help Erica count the number of beautiful triplets in the sequence?

Input Format

The first line contains 22 space-separated integers, nn (the length of the sequence) and dd (the beautiful difference), respectively. 
The second line contains nn space-separated integers describing Erica's increasing sequence, a0,a1,…,an−1a0,a1,…,an−1.

Constraints

1≤n≤1041≤n≤104
1≤d≤201≤d≤20
0≤ai≤2×1040≤ai≤2×104
ai>ai−1ai>ai−1 for 0<i≤n−10<i≤n−1
Output Format

Print a single line denoting the number of beautiful triplets in the sequence.

Sample Input

7 3
1 2 4 5 7 8 10
Sample Output

3
Explanation

Our input sequence is 1,2,4,5,7,8,101,2,4,5,7,8,10, and our beautiful difference d=3d=3. There are many possible triplets (ai,aj,ak)(ai,aj,ak), but our only beautiful triplets are (1,4,7)(1,4,7) , (4,7,10)(4,7,10) and (2,5,8)(2,5,8). Please see the equations below:

7−4=4−1=3=d7−4=4−1=3=d 
10−7=7−4=3=d10−7=7−4=3=d
8−5=5−2=3=d8−5=5−2=3=d

Recall that a beautiful triplet satisfies the following equivalence relation: a[j]−a[i]=a[k]−a[j]=da[j]−a[i]=a[k]−a[j]=d where i<j<ki<j<k.

*/

/*
Solved 9m07s77
20160429Fri 11:34
*/