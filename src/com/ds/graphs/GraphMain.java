package com.ds.graphs;

public class GraphMain {

	public static void main(String[] args) {

		Graph graph = new Graph(12);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);

		graph.addEdge(2, 3);
		//graph.addEdge(3, 0);
		// graph.addEdge(2, 4);

		graph.addEdge(4, 5);

		graph.addEdge(5, 7);
		graph.addEdge(5, 6);
		graph.addEdge(5, 11);

		graph.addEdge(7, 8);
		graph.addEdge(8, 9);
		graph.addEdge(8, 10);
		
		//graph.addEdge(9, 11);
		
		/*
		 *                        10
		 *                        |
		 *  0----1            7---8---9
		 *  |    |            |
		 *  3----2---4--------5---11
		 *                    |
		 *                    6
		 *      
		 */

		graph.bfs();
		
		graph.bfs(1, 11);
		
		graph.dfsRec();
		
		System.out.println("cycle exists : "+graph.undirectedCycleBFS());
	}

}
