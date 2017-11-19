package SRM723.problem1;

public class BuffaloBuffalo {
	public String check(String s) {
		String b = "buffalo";
		String[] ss = s.split(" ");
		for (int i = 0; i < ss.length; i++)
			if (!ss[i].equals(b)) return "Not good";
		return "Good";
	}
}
/*
Problem Statement
Did you know that "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo." is a grammatically correct sentence in American English? 

In this problem we call a string good if it satisfies the following constraints: 
The string contains one or more words.
Each word in the string is "buffalo".
Each pair of consecutive words is separated by exactly one space.
There are no spaces at the beginning of the string.
There are no spaces at the end of the string.
For example, the strings "buffalo", "buffalo buffalo" and "buffalo buffalo buffalo" are good but " buffalo", "buffalobuffalo", "buff alo", and "cow" are not. 

You are given a s that consists of spaces and lowercase letters. Return "Good" if s is a good string. Otherwise, return "Not good". (Note that the return value is case-sensitive.)
Definition
Class: BuffaloBuffalo
Method: check
Parameters: String
Returns: String
Method signature: String check(String s)
(be sure your method is public)
Limits
Time limit (s): 2.000
Memory limit (MB): 256
Constraints
- s will contain between 1 and 1,000 characters, inclusive.
- Each character in s will be a lowercase English letter ('a' - 'z') or a space (' ').
Examples
0)
"buffalo buffalo"
Returns: "Good"
This is a good sentence contains two 'buffalo'.
1)
"buffalobuffalo"
Returns: "Not good"
There must be exactly one space between two words.
2)
"buffalo buffalo buffalo"
Returns: "Good"
3)
"buf falo buffalo"
Returns: "Not good"
4)
"cow"
Returns: "Not good"
5)
"buffalo buffalo"
Returns: "Not good"
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/
//Been challenged successfully.
