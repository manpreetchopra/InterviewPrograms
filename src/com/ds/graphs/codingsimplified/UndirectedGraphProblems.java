package com.ds.graphs.codingsimplified;

public class UndirectedGraphProblems {

	public static void main(String[] args) {
		
		/*
		 * 	0---1---3
		 *	|       |
		 *	2---4---5
		 *		|
		 *		6
		 */
		int nodes = 7;
		UndirectedGraph graph = new UndirectedGraph(nodes);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		

		graph.dfs(0);
		graph.bfs(0);
		
		System.out.println(graph.isConnectedBFS());
		System.out.println(graph.numberOfConnectedComponents());
		System.out.println(graph.isPathExists(0, 6));
		System.out.println("cyclic : "+graph.hasCycle());
		System.out.println("cyclic : "+graph.hasCycleRec());

	}
}
