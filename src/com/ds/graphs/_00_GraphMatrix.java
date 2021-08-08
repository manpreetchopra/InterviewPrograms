package com.ds.graphs;

public class _00_GraphMatrix {
	
	public static void main(String[] args) {
		_00_GraphMatrix.GraphMatrix graph = new _00_GraphMatrix.GraphMatrix(5);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		graph.addEdge(2, 4);
		
		System.out.println(graph.toString());
	}

	static class GraphMatrix{
	int[][] adj; //matrix to store graph representation
	int v; //number of vertices/node
	int e; //number of edges
	
	GraphMatrix(int nodes){
		v = nodes; //for 1 order graph
		e = 0;
		adj = new int[v][v];
	}

	public void addEdge(int u, int v) {
		adj[u][v] = 1;
		adj[v][u] = 1;
		e++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(v+" Vertices, "+e+" edges\n");
		for(int i = 0; i<v; i++) {
			sb.append("vertex : "+i+" -->");
			for(int j : adj[i]) {
				sb.append(j+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	}
}
