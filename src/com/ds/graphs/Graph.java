package com.ds.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	/*
	 * Graph creation using adjacency list
	 */
	LinkedList<Integer>[] adj;
	
	/*
	 * Constructor --  initializing adj list with empty linkedlists
	 */
	public Graph(int vertices) {
		adj = new LinkedList[vertices];
		for(int i=0; i<vertices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	/*
	 * Adding edges from source to destination
	 */
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	
	/*
	 * BFS - ALL vertices
	 */
	public void bfs() {
		boolean[] visited = new boolean[adj.length];
		for(int vertex=0 ; vertex <adj.length; vertex++) {
			if(!visited[vertex]) {
				bfs(vertex,visited);
			}
		}
	}

	//BFS -- ALL vertices helper method
	private void bfs(int vertex, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(vertex);
		visited[vertex] = true;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current+" ");
			
			for(int neighbor : adj[current]) {
				if(!visited[neighbor]) {
					q.offer(neighbor);
					visited[neighbor] = true;
				}
			}
		}
		System.out.println();
	}
	
	/*
	 * BFS -- source till destination
	 */
	public void bfs(int source, int destination) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[adj.length];
		//to keep track of parent item, to draw path
		int[] parent = new int[adj.length];
		
		q.offer(source);
		parent[source] = -1;// parent came from nowhere
		visited[source] = true;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current+" ");
			
			if(current == destination) {
				break;
			}
			
			for(int neighbor: adj[current]) {
				if(!visited[neighbor]) {
					q.offer(neighbor);
					parent[neighbor] = current;
					visited[neighbor] = true;
				}
			}
		}
		System.out.println();
		
		int current = destination; 
		while(parent[current] != -1) {
			System.out.print(current+" ->");
			current = parent[current];
		}
		System.out.println(current);
	}
	
	public void dfsRec() {
		boolean[] visited = new boolean[adj.length];
		for(int vertex = 0; vertex<adj.length; vertex++) {
			if(!visited[vertex]) {
				visited[vertex] = true;
				dfsRec(vertex,visited);
			}
		}
	}

	private void dfsRec(int current, boolean[] visited) {
		System.out.print(current+" ");
		for (int neighbor : adj[current]) {
			if(!visited[neighbor]) {
				visited[neighbor] = true;
				dfsRec(neighbor,visited);
			}
		}
	}
	
	public boolean undirectedCycleBFS() {
		boolean[] visited = new boolean[adj.length];
		int[] parent = new int[adj.length];
		
		for(int vertex =0; vertex<adj.length; vertex++) {
			if(!visited[vertex]) {
				Queue<Integer> q = new LinkedList<>();
				q.offer(vertex);
				visited[vertex] = true;
				parent[vertex] = -1;
				
				while(!q.isEmpty()) {
					int current = q.poll();
					for(int neighbor : adj[current]) {
						if(!visited[neighbor]) {
							visited[neighbor] = true;
							q.offer(neighbor);
							parent[neighbor] = current;
						}else {
							if(parent[current] != neighbor) {
								return true;
							}
						}
					}	
				}
				
			}
		}
		
		return false;
	}
	
}
