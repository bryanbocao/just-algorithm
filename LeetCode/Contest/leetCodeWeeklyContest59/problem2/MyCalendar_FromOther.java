package leetCodeWeeklyContest59.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyCalendar {
	List<int[]> rs;

    public MyCalendar() {
        rs = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] r : rs){
        	if(Math.max(start, r[0]) < Math.min(end, r[1])){
        		return false;
        	}
        }
        rs.add(new int[]{start, end});
        return true;
    }
}
/*
https://leetcode.com/contest/weekly-contest-59/problems/my-calendar-i/
729. My Calendar I My SubmissionsBack to Contest
User Accepted: 1138
User Tried: 1423
Total Accepted: 1167
Total Submissions: 3825
Difficulty: Medium
Implement a MyCalendar class to store your events. A new event can be added if adding the event will not cause a double booking.

Your class will have the method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.

A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)

For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.

Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
Example 1:
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(15, 25); // returns false
MyCalendar.book(20, 30); // returns true
Explanation: 
The first event can be booked.  The second can't because time 15 is already booked by another event.
The third event can be booked, as the first event takes every time less than 20, but not including 20.
Note:

The number of calls to MyCalendar.book per test case will be at most 1000.
In calls to MyCalendar.book(start, end), start and end are integers in the range [0, 10^9].
*/
//Author: https://leetcode.com/uwi/
//PracticedOn20171119Sun 5Times