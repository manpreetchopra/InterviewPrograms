package com.ds.graphs.codingsimplified;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DirectedGraph {

	private List<List<Integer>> graph;

	public DirectedGraph(int nodes) {
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}
	
	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}
	
	public void dfs(int start) {
		System.out.println("----------dfs-----------");
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];
		
		stack.push(start);
		visited[start] = true;
		
		while(!stack.isEmpty()) {
			Integer current = stack.pop();
			
			System.out.print(current);
			
			List<Integer> nbrs = graph.get(current);
			
			for(int nbr:nbrs) {
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
			
			System.out.print(current);
			
			List<Integer> nbrs = graph.get(current);
			
			for(int nbr:nbrs) {
				if(!visited[nbr]) {
					quee.offer(nbr);
					visited[nbr] = true;
				}
			}
			
		}
		System.out.println();
	}
	
	public boolean isStronglyConnectedDFS() {
		System.out.println("----------dfs-----------");
		Stack<Integer> stack = new Stack<>();
		
		for (int vtx = 0; vtx < graph.size(); vtx++) {
			int start = vtx;

			boolean[] visited = new boolean[graph.size()];

			stack.push(start);
			visited[start] = true;

			while (!stack.isEmpty()) {
				Integer current = stack.pop();

				System.out.print(current);

				List<Integer> nbrs = graph.get(current);

				for (int nbr : nbrs) {
					if (!visited[nbr]) {
						stack.push(nbr);
						visited[nbr] = true;
					}
				}

			}
			
			for(int i = 0; i<visited.length; i++) {
				if(!visited[i]) {
					return false;
				}
			}
		}
		
		System.out.println();
		return true;
	}
	
	public boolean isPathExists(int src, int dest) {
		boolean[] visited = new boolean[graph.size()];
		return isPathExists(src, dest, visited);
	}
	
	public boolean isPathExists(int src, int dest, boolean[] visited) {
		
		if(src == dest) {
			return true;
		}
		visited[src] = true;
		List<Integer> nbrs = graph.get(src);
		for(int nbr : nbrs) {
			if(!visited[nbr]) {
				if(isPathExists(nbr, dest, visited)) {
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	public boolean isCyclicDFT() {
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];
		boolean[] recursiveStack = new boolean[graph.size()];
		for(int vertex = 0 ;vertex <graph.size(); vertex++) {
			if(!visited[vertex])
				
				stack.push(vertex);
				visited[vertex] = true;
				recursiveStack[vertex] = true;
				
				while(!stack.isEmpty()) {
					Integer current = stack.peek();
					//recursiveStack[current] = false;
					
					List<Integer> nbrs = graph.get(current);
					int nbr = -1;
					for(int nbrr : nbrs) {
						if(recursiveStack[nbrr]) {
							return true;
						}
						if(!visited[nbrr]) {
							nbr = nbrr;
							break;
						}
					}
					if(nbr == -1) {
						stack.pop();
						System.out.print(current);
						recursiveStack[current] = false;
					}else {
//						int nbr = -1;
//						for(int nbrr : nbrs) {
//							if(!visited[nbrr]) {
//								nbr = nbrr;
//								break;
//							}
//						}
						//int nbr = nbrs.get(0);
					//for(int nbr : nbrs) {
						if(recursiveStack[nbr]) {
							return true;
						}
						if(!visited[nbr]) {
							stack.push(nbr);
							visited[nbr] = true;
							recursiveStack[nbr] = true;
							
						}
					//}
					}
				}
		}
		return false;
		
	}
	
	public boolean isCyclic() {
		boolean[] visited = new boolean[graph.size()];
		boolean[] recursiveStack = new boolean[graph.size()];
		
		for(int vertex = 0; vertex<graph.size();vertex++) {
			if(isCyclic(vertex,visited,recursiveStack)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isCyclic(int current, boolean[] visited, boolean[] recursiveStack) {
		
		if(recursiveStack[current]) {
			return true;
		}
		
		if(visited[current]) {
			return false;
		}
		
		visited[current]  = true;
		recursiveStack[current] = true;
		
		List<Integer> nbrs = graph.get(current);
		for(int nbr : nbrs) {
			if(isCyclic(nbr,visited,recursiveStack)) {
				return true;
			}
		}
		recursiveStack[current] = false;
		return false;
	}
	
	//Using Kojaraju's algo variation
	public int findMotherVertex() {

		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[graph.size()];
		
		for(int vertex = 0; vertex<graph.size(); vertex++) {
			if(!visited[vertex]) {
				motherVertexDFS(vertex, stack, visited);
			}
		}
		
		int potAns = stack.pop();
		visited = new boolean[graph.size()];
		
		motherVertexDFS(potAns, stack, visited);
		
		for(boolean visit : visited) {
			if(!visit) {
				return -1;
			}
		}
		return potAns;
	}
	
	public void motherVertexDFS(int vertex, Stack<Integer> stack, boolean[] visited) {
		visited[vertex] = true;
		
		List<Integer> nbrs = graph.get(vertex);
		for(int nbr : nbrs) {
			if(!visited[nbr]) {
				motherVertexDFS(nbr, stack, visited);
			}
		}
		
		stack.push(vertex);
	}
	
}
