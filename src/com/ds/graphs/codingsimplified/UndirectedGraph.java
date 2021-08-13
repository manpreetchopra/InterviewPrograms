package com.ds.graphs.codingsimplified;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class UndirectedGraph {

	List<List<Integer>> graph ;
	
	public UndirectedGraph(int numOfVtces) {
		graph = new ArrayList<>();
		for(int i = 0; i<numOfVtces; i++) {
			graph.add(i, new ArrayList<>());
		}
	}
	
	public void addEdge(int a, int b) {
		graph.get(a).add(b);
		graph.get(b).add(a);
	}
	
	public void dfs(int start) {
		System.out.println("----------dfs-----------");
		Stack<Integer> stack = new Stack<>();
		
		boolean[] visited = new boolean[graph.size()];
		stack.push(start);
		visited[start] = true;
		
		while(!stack.isEmpty()) {
			Integer current = stack.pop();
			
			System.out.print(current+"");
			
			List<Integer> nbrs = graph.get(current);
			for(int nbr : nbrs) {
				if(!visited[nbr]) {
					stack.push(nbr);
					visited[nbr] = true;
				}
			}
		}
		System.out.println();
	}
	
	public void bfs(int start) {
		System.out.println("----------bfs-----------");
		Queue<Integer> quee = new LinkedList<>();
		
		boolean[] visited = new boolean[graph.size()];
		quee.offer(start);
		visited[start] = true;
		
		while(!quee.isEmpty()) {
			Integer current = quee.poll();
			
			System.out.print(current+"");
			
			List<Integer> nbrs = graph.get(current);
			for(int nbr : nbrs) {
				if(!visited[nbr]) {
					quee.offer(nbr);
					visited[nbr] = true;
				}
			}
		}
		System.out.println();
	}
	
	public boolean isConnectedBFS() {
		System.out.println("----------isConnected-----------");
		
		int start = 0;
		Queue<Integer> quee = new LinkedList<>();
		
		boolean[] visited = new boolean[graph.size()];
		quee.offer(start);
		visited[start] = true;
		
		while(!quee.isEmpty()) {
			Integer current = quee.poll();
			
			System.out.print(current+"");
			
			List<Integer> nbrs = graph.get(current);
			for(int nbr : nbrs) {
				if(!visited[nbr]) {
					quee.offer(nbr);
					visited[nbr] = true;
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<visited.length; i++) {
			if(!visited[i]) {
				return false;
			}
		}
		return true;
	}
		
	
	public int numberOfConnectedComponents() {

		int count = 0;
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];

		for (int vertex = 0; vertex < graph.size(); vertex++) {
			int start = vertex;

			if (!visited[start]) {
				count++;
				stack.push(start);
				visited[start] = true;

				while (!stack.isEmpty()) {
					Integer current = stack.pop();

					List<Integer> nbrs = graph.get(current);
					for (int nbr : nbrs) {
						if (!visited[nbr]) {
							stack.push(nbr);
							visited[nbr] = true;
						}
					}
				}
			}
		}

		return count;

	}
	
	public boolean isPathExists(int src, int dest) {
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];
		
		stack.push(src);
		visited[src] = true;
		
		while(!stack.isEmpty()) {
			Integer current = stack.pop();
			
			if(current == dest) {
				return true;
			}
			
			List<Integer> nbrs = graph.get(current);
			for(int nbr : nbrs) {
				if(!visited[nbr]) {
					stack.push(nbr);
					visited[nbr] = true;
				}
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean hasCycle() {
		
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];
		int[] parent = new int[graph.size()];
		
		for(int vertex = 0; vertex<graph.size(); vertex++) {
			int start = vertex;
			
			if(!visited[start]) {
				
				stack.push(start);
				visited[start] = true;
				parent[start] = -1;
				
				while(!stack.isEmpty()) {
					Integer current = stack.pop();
					
					List<Integer> nbrs = graph.get(current);
					for(int nbr : nbrs) {
						if(!visited[nbr]) {
							stack.push(nbr);
							visited[nbr] = true;
							parent[nbr] = current;
						}else if(parent[current] != nbr) {
							return true;
						}
					}
					
				}
			}
		}
		
		return false;
	}
	
	
	public boolean hasCycleRec() {
		boolean[] visited = new boolean[graph.size()];
		for(int vertex = 0; vertex<graph.size(); vertex++) {
			if(!visited[vertex]) {
				if(hasCycleRec(vertex,-1, visited)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean hasCycleRec(int current, int parent, boolean[] visited) {
		
		visited[current] = true;
		
		List<Integer> nbrs = graph.get(current);
		for(int nbr : nbrs) {
			if(!visited[nbr]) {
				hasCycleRec(nbr,current,visited);
			}else if(nbr != parent){
				return true;
			}
		}
		return false;
	}
}
