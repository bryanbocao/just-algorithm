package leetCodeWeeklyContest35.problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for (int i = 0; i < paths.length; i++) {
    		String path = paths[i];
    		String[] ss = path.split(" ");
    		String dir = new String();
    		for (int j = 0; j < ss.length; j++) {
    			if (j == 0) dir = ss[j];
    			else {
    				int indexL = ss[j].indexOf('('), indexR = ss[j].indexOf(')');
    				String file = ss[j].substring(0, indexL), content = ss[j].substring(indexL + 1, indexR);
    				if (map.containsKey(content)) {
    					map.get(content).add(dir + "/" + file);
    				} else {
    					List<String> ls = new ArrayList<String>();
    					ls.add(dir + "/" + file);
    					map.put(content, ls);
    				}
    			}
    		}
    	}
    	
    	Set<String> set = map.keySet();
    	Iterator<String> it = set.iterator();
    	List<List<String>> lsls = new ArrayList<List<String>>();
    	while (it.hasNext()) {
    	    String content = it.next();
    	    List<String> ls = map.get(content);
    	    if (ls.size() > 1) lsls.add(ls);
    	}
    	return lsls;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-35/problems/find-duplicate-file-in-system/
609. Find Duplicate File in System My SubmissionsBack To Contest
User Accepted: 666
User Tried: 704
Total Accepted: 672
Total Submissions: 1263
Difficulty: Medium
Given a list of directory info including directory path, and all the files with contents in this directory, you need to find out all the groups of duplicate files in the file system in terms of their paths.

A group of duplicate files consists of at least two files that have exactly the same content.

A single directory info string in the input list has the following format:

"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"

It means there are n files (f1.txt, f2.txt ... fn.txt with content f1_content, f2_content ... fn_content, respectively) in directory root/d1/d2/.../dm. Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.

The output is a list of group of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. A file path is a string that has the following format:

"directory_path/file_name.txt"

Example 1:
Input:
["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
Output:  
[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
Note:
No order is required for the final output.
You may assume the directory name, file name and file content only has letters and digits, and the length of file content is in the range of [1,50].
The number of files given is in the range of [1,20000].
You may assume no files or directories share the same name in the same directory.
You may assume each given directory info represents a unique directory. Directory path and file info are separated by a single blank space.
Follow-up beyond contest:
Imagine you are given a real file system, how will you search files? DFS or BFS?
If the file content is very large (GB level), how will you modify your solution?
If you can only read the file by 1kb each time, how will you modify your solution?
What is the time complexity of your modified solution? What is the most time-consuming part and memory consuming part of it? How to optimize?
How to make sure the duplicated files you find are not false positive?
 */

/*
Input:
["root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"]
Output:
[["root/a/2.txt"],["root/c/d/4.txt"],["root/c/3.txt"],["root/a/1.txt"]]
Expected:
[]
*/

//SolvedOn20170603Sat CodingDuration:32m07s77
