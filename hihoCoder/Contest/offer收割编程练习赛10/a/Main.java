package hihoCoder.Contest.offer收割编程练习赛10.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.contains("A")) {
                int ii = s.indexOf('A') + 1;
                if (ii < s.length() && s.substring(ii).contains("A")){
                    System.out.println("NO");
                    continue;
                }
            }
            boolean yes = true;
            if (s.contains("L")) {
                for (int ii = s.indexOf('L'); ii >= 0 && ii < s.length(); ii = s.indexOf('L')) {
                    if (ii + 1 < s.length() && s.charAt(ii + 1) == 'L' &&
                            ii + 2 < s.length() && s.charAt(ii + 2) == 'L') {
                        yes = false;
                        break;
                    }
                    if (ii + 1 < s.length()) s = s.substring(ii + 1);
                    else break;
                }
            }
            if (yes) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }

}
//http://hihocoder.com/contest/offers10/problem/1
/*
P1 : 出勤记录I
Time Limit:10000ms
Case Time Limit:1000ms
Memory Limit:256MB
Description
小Hi的算法课老师每次上课都会统计小Hi的出勤记录。迟到会被记录一个L，缺席会被记录一个A，按时上课会被记录一个O。

一学期结束，小Hi的出勤记录可以看成是一个只包含LAO的字符串，例如"OOOOLOOOLALLO……"。

如果小Hi整学期缺席不超过1次，并且没有连续3次迟到，小Hi的出勤记录就算合格。

现在给出小Hi的出勤记录，你能判断他是否合格么？

Input
输入第一行包含一个整数T(1 <= T <= 10)，代表测试数据的组数。

以下T行每行一个程度不超过100的字符串S，代表小Hi的出勤记录。

Output
对于每一份出勤记录，输出YES或者NO表示该份记录是否合格。

Sample Input
3
LLOLLALL
OLLLOOOO
OOAAOOOO
Sample Output
YES
NO
NO
 */
//ACCEPTED Submitted:2017-03-19 12:36:22
