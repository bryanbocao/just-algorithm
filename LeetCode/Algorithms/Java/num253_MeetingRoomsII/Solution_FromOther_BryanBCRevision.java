package num253_MeetingRoomsII;

import java.util.Arrays;

public class Solution_FromOther_BryanBCRevision {
	public int minMeetingRooms(Interval[] intervals) {
		Interval[] itv = intervals;
		int len = intervals.length;
		int[] sts = new int[len], ets = new int[len];
		for (int i = 0; i < len; i++) {
			sts[i] = itv[i].start;
			ets[i] = itv[i].end;
		}
		Arrays.sort(sts);
		Arrays.sort(ets);
		int mr = 0, ets_i = 0;
		for (int i = 0; i < len; i++) {
			if (sts[i] < ets[ets_i]) mr++;
			else ets_i++;
		}
		return mr;
	}
}
/*
 * https://leetcode.com/problems/meeting-rooms-ii/#/description 253. Meeting
 * Rooms II DescriptionHintsSubmissionsDiscussSolution Discuss Pick One Given an
 * array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms
 * required.
 * 
 * For example, Given [[0, 30],[5, 10],[15, 20]], return 2.
 */
// From https://discuss.leetcode.com/topic/30610/super-easy-java-solution-beats-98-8
// Author https://discuss.leetcode.com/user/pinkfloyda
// PracticedOn20170718Tue 2Times