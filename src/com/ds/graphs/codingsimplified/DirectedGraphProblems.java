package com.ds.graphs.codingsimplified;

public class DirectedGraphProblems {
	
	public static void main(String[] args) {
		
		/*
		 * 	0--->1--->3
		 *	|         |
		 *  v         v
		 *	2--->4--->5
		 *		 |
		 *       v
		 *		 6
		 */
		int nodes = 7;
		DirectedGraph graph = new DirectedGraph(nodes);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		//graph.addEdge(6, 2);

		graph.dfs(0);
		graph.bfs(0);
		System.out.println(graph.isStronglyConnectedDFS());
		System.out.println("Path exists ? "+graph.isPathExists(0, 6));

		DirectedGraph a = new DirectedGraph(4);

		a.addEdge(0, 1);
		a.addEdge(1, 2);
		a.addEdge(2, 0);
		a.addEdge(0, 3);
		a.addEdge(3, 2);

		System.out.println(a.isStronglyConnectedDFS());
		
		System.out.println("------------------DFT");
		System.out.println(graph.isCyclicDFT());
		
		System.out.println("isCycle");
		System.out.println(graph.isCyclic());
		
		DirectedGraph dg = new DirectedGraph(4);
		  dg.addEdge(0,1);
	        dg.addEdge(1,2);
	        dg.addEdge(3,0);
	        dg.addEdge(3,1);
	        
	        System.out.println(dg.findMotherVertex());
	}

}
