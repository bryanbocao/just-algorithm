# Algorithms
This repository is to record my and others' decent solutions found. In terms of other's solutions I will refer to its original place.

Testing code instructions:
##Option 1:
If you want to test these code, please delete the first line of package statement and the last few comments, then submit the rest of the code.
For example, the solution of CompareTheTriplets is:
```
package algorithms.warmup;
import java.util.*;
public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int a0 = sc.nextInt(), a1 = sc.nextInt(), a2 = sc.nextInt();
		int b0 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();
		if (a0 > b0) a++;
		else if (a0 < b0) b++;
		if (a1 > b1) a++;
		else if (a1 < b1) b++;
		if (a2 > b2) a++;
		else if (a2 < b2) b++;
		System.out.println(a + " " + b);
		sc.close();
	}

}
//https://www.hackerrank.com/challenges/compare-the-triplets
//20160714Thu14:46 duration:7m42s10 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
```
Delete 
```
package algorithms.warmup;
```
and
```
//https://www.hackerrank.com/challenges/compare-the-triplets
//20160714Thu14:46 duration:7m42s10 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
```
You would submit the code like this:
```
import java.util.*;
public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int a0 = sc.nextInt(), a1 = sc.nextInt(), a2 = sc.nextInt();
		int b0 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();
		if (a0 > b0) a++;
		else if (a0 < b0) b++;
		if (a1 > b1) a++;
		else if (a1 < b1) b++;
		if (a2 > b2) a++;
		else if (a2 < b2) b++;
		System.out.println(a + " " + b);
		sc.close();
	}

}
```

##Option 2:
Some problems just need some blocks of the code but not the entire scripts, in this case just copy the scrips inside these two tags
```
// BryanBo-Cao's code ====== start 

// BryanBo-Cao's code ====== end
```

##Useful Links:
http://coolshell.cn/articles/12052.html

https://www.youtube.com/watch?v=264b_f6828Y&list=PLGvfHSgImk4ZR3v2drDwHrmwu2a645sxL

https://www.zhihu.com/question/20368410
