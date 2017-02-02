package ladders.USGiants.l8_SearchAndRecursion.num127_TopologicalSorting;

/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        ArrayList<DirectedGraphNode> resLs = new ArrayList<DirectedGraphNode>();
        if (graph == null) return resLs;
        Queue<DirectedGraphNode> queue = new LinkedList<DirectedGraphNode>();
        queue.offer(graph.get(0));
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                resLs.add(queue.peek());
                ArrayList<DirectedGraphNode> neighborsLs = queue.peek().neighbors;
                Iterator<DirectedGraphNode> it = neighborsLs.iterator();
                while (it.hasNext()) {
                    DirectedGraphNode gn = it.next();
                    if (gn != null) queue.offer(gn);
                }
            }
        }
        return resLs;
    }
}
//http://www.lintcode.com/en/problem/topological-sorting/
/*
 Topological Sorting

 Description
 Notes
 Testcase
 Judge
Given an directed graph, a topological order of the graph nodes is defined as follow:

For each directed edge A -> B in graph, A must before B in the order list.
The first node in the order can be any node in the graph with no nodes direct to it.
Find any topological order for the given graph.

 Notice

You can assume that there is at least one topological order in the graph.

Have you met this question in a real interview? Yes
Clarification
Learn more about representation of graphs

Example
For graph as follow:

picture

The topological order can be:

[0, 1, 2, 3, 4, 5]
[0, 2, 3, 1, 5, 4]
...
 */
//TriedOn20170212Sun16:43 CodingDuration:9m12s19 Memory Limit Exceeded