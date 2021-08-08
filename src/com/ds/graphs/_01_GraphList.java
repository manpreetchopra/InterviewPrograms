package com.ds.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _01_GraphList {
	
	public static void main(String[] args) {
		_01_GraphList.GraphList graph  = new _01_GraphList.GraphList(12);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		//graph.addEdge(2, 4);
		
		graph.addEdge(4, 5);
		
		graph.addEdge(5, 7);
		graph.addEdge(5, 6);
		graph.addEdge(5, 11);
		
		graph.addEdge(7, 8);
		graph.addEdge(8, 9);
		graph.addEdge(8, 10);
		
		System.out.println(graph.toString());
		/*
		 *                        10
		 *                        |
		 *  0----1            7---8---9
		 *  |    |            |
		 *  3----2---4--------5---11
		 *                    |
		 *                    6
		 * */
		
		graph.bfs();
		System.out.println();
		graph.bfs(1,11);
		
		System.out.println("------dfsj");
		graph.dfs();
		
		System.out.println(graph.dfsStack(0, 9));
		System.out.println("rec");
		System.out.println(graph.dfsRec(0, 9));
		
	}

	static class GraphList {
		LinkedList<Integer>[] adj;

		public GraphList(int v) {
			adj = new LinkedList[v];
			for (int i = 0; i < v; i++) {
				adj[i] = new LinkedList<>();
			}
		}

		public void addEdge(int source, int destination) {
			adj[source].add(destination);
			adj[destination].add(source);
		}
		
		public void bfs() {
			boolean[] visited = new boolean[adj.length];
			for (int v = 0; v < adj.length; v++) {
				if (!visited[v]) {
					bfs(v, visited);
				}
			}
		}

		public void bfs(int source, boolean[] visited) {
			Queue<Integer> q = new LinkedList<>();

			q.offer(source);
			visited[source] = true;
			while (!q.isEmpty()) {
				Integer u = q.poll();
				System.out.print(u + " ");

				for (int v : adj[u]) {
					if (!visited[v]) {
						visited[v] = true;
						q.offer(v);
					}
				}

			}
		}

		public int bfs(int source, int destination) {
			Queue<Integer> q = new LinkedList<>();
			boolean visited[] = new boolean[adj.length];
			int[] parent = new int[adj.length];
			
			q.offer(source);
			visited[source] = true;
			parent[source] = -1;
			
			while(!q.isEmpty()) {
				int current = q.poll();
				
				if(current == destination) {
					break;
				}
				
				for(int neighbor : adj[current]) {
					if(!visited[neighbor]) {
						q.offer(neighbor);
						visited[neighbor] = true;
						parent[neighbor] = current;
					}
				}
			}
			
			int current = destination;
			int distance = 0;
			while(parent[current] != -1) {
				System.out.print(current+" -->");
				distance++;
				current = parent[current];
			}
			System.out.println(current);
			return distance;
		}
		
		public boolean dfsRec(int source, int destination) {
			boolean[] visited =  new boolean[adj.length];
			visited[source] = true;
			 return  dfsRec(source, destination, visited);
		}

		public boolean dfsRec(int source, int destination, boolean[] visited) {
			if (source == destination) {
				return true;
			}
			for (int neighbor : adj[source]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					boolean isConnected = dfsRec(neighbor, destination, visited);
					if (isConnected)
						return true;
				}
			}

			return false;

		}
		
		public boolean dfsStack(int source, int destination) {
			Stack<Integer> stack = new Stack<Integer>();
			boolean[] visited =  new  boolean[adj.length];
			
			stack.push(source);
			visited[source] = true;
			
			while(!stack.isEmpty()) {
				int current  = stack.pop();
				System.out.print(current +" ");
				if(current == destination) {
					return true;
				}
				for(int neighbor : adj[current]) {
					if(!visited[neighbor]) {
						stack.push(neighbor);
						visited[neighbor] = true;
					}
				}
			}
			
			return false;
		}
		
		
		
		public void dfs() {
			boolean[] visited = new boolean[adj.length];
			for (int v = 0; v < adj.length; v++) {
				if (!visited[v]) {
					dfs(v, visited);
				}
			}
			System.out.println();
		}

		public void dfs(int source, boolean[] visited) {
			Stack<Integer> stack = new Stack<>();

			stack.push(source);
			visited[source] = true;
			while (!stack.isEmpty()) {
				Integer current = stack.pop();
				System.out.print(current+" ");
				for(int neighbor : adj[current]) {
					if(!visited[neighbor]) {
						stack.push(neighbor);
						visited[neighbor] = true;
					}
				}
			}
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < adj.length; i++) {
				sb.append(i + " -->");
				for (int j : adj[i]) {
					sb.append(j + " ");
				}
				sb.append("\n");
			}
			return sb.toString();
		}

	}
}
