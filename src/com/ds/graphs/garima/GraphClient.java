package com.ds.graphs.garima;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		
		/*
		 * 
		 *   A----D----E
		 *   |    |    |\
		 *   B----C    | \
		 *             F--G
		 * 
		 */
		Graph graph  = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 1);
		graph.addEdge("C", "D", 8);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 45);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 8);
		
//		graph.display();
//		
//		System.out.println(graph.numVertex());
//		System.out.println(graph.numEdges());
//		
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		
//		graph.removeEdge("A", "B");
//		graph.display();
//		
//		graph.removeVertex("F");
//		graph.display();
//		
//		graph.addVertex("F");
//		graph.display();
//		
//		graph.addEdge("A", "F", 10);
//		graph.display();
		
//		System.out.println(graph.bfs("A", "F"));
//		System.out.println(graph.dfs("A", "F"));
//		
//		graph.removeEdge("A", "D");
//		System.out.println(graph.bfs("A", "F"));
//		System.out.println(graph.dfs("A", "F"));
//		
//		//System.out.println(graph.hasPath("A", "F", new HashMap<>()));
//		
//		graph.removeEdge("D", "E");
//		System.out.println(graph.bfs("A", "F"));
//		System.out.println(graph.dfs("A", "F"));
//		
		//System.out.println(graph.hasPath("A", "F", new HashMap<>()));
		
		graph.bft();
		graph.dft();
		System.out.println("Connected ? "+graph.isConnectedBFT());
		System.out.println("isTree? "+graph.isTree());
		System.out.println(graph.isCyclicBFT());
		
		graph.removeEdge("B", "C");
		
		graph.bft();
		graph.dft();
		System.out.println(graph.isCyclicBFT());
		System.out.println("Connected ? "+graph.isConnectedBFT());
		System.out.println("isTree? "+graph.isTree());
		
		graph.removeEdge("F", "G");
		System.out.println(graph.isCyclicBFT());
		System.out.println("Connected ? "+graph.isConnectedBFT());
		System.out.println("isTree? "+graph.isTree());
		
		graph.removeEdge("D","E");
		
		System.out.println("Connected ? "+graph.isConnectedBFT());
		System.out.println("isTree? "+graph.isTree());
		//graph.bfs("A","G");
		
		System.out.println("-----------------connected compo");
		System.out.println(graph.getConnectedComponents());
	}
}
