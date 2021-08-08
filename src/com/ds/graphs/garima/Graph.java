package com.ds.graphs.garima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

	private class Vertex{
		Map<String,Integer> nbrs = new HashMap<>();
	}
	
	Map<String,Vertex> vtces;
	
	public Graph() {
		vtces = new HashMap<>();
	}
	
	public int numVertex() {
		return this.vtces.size();
	}
	
	public boolean containsVertex(String vname) {
		return this.vtces.containsKey(vname);
	}
	
	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		this.vtces.put(vname, vtx);
	}
	
	public void removeVertex(String vname) {
		Vertex vtx = vtces.get(vname);
		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
		
		for(String key: keys) {
			Vertex nbrVtx = vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		
		vtces.remove(vname);
	}
	
	public int numEdges() {
		int count = 0;
		List<String> keys = new ArrayList<>(vtces.keySet());
		
		for(String key : keys) {
			Vertex vtx = vtces.get(key);
			count = count + vtx.nbrs.size();
		}
		
		return count/2;
	}
	
	public boolean containsEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2) || !vtx2.nbrs.containsKey(vname1)) {
			return false;
		}
		return true;
				
		
	}
	
	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1 ==null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
		
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}
	
	public void display() {
		System.out.println("-------------------------------");
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		for(String key : keys) {
			Vertex vtx = vtces.get(key);
			System.out.println(key+" : "+vtx.nbrs);
		}
		System.out.println("-------------------------------");
	}
	
	public boolean hasPath(String vname1, String vname2, Map<String,Boolean> processed) {
		//System.out.println("-----------------------hasPath-------------------------");
		processed.put(vname1, true);
		if(containsEdge(vname1, vname2)) {
			return true;
		}
		
		Vertex v1 = vtces.get(vname1);
		ArrayList<String> nbrs = new ArrayList<>(v1.nbrs.keySet());
		
		for(String nbr: nbrs) {
			if(!processed.containsKey(nbr) && hasPath(nbr,vname2,processed)) {
				return true;
			}
		}
		//System.out.println("------------------------------------------------------");
		return false;
	}
	
	/*
	 * BFS
	 */
	//Pair class to keep map of vertex with its path
	class Pair{
		String vname;
		String psf;
	}

	/*
	 * Breadth First search -  between src an ddest
	 */
	public boolean bfs(String src, String dest) {
		System.out.println("------------------------bfs------------------------");
		HashMap<String,Boolean> processed = new HashMap<>();
		
		LinkedList<Pair> quee = new LinkedList<>();
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		
		quee.addLast(sp);
		
		while(!quee.isEmpty()) {
			Pair rp = quee.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			
			if(containsEdge(rp.vname, dest)) {
				System.out.println(rp.psf + dest);
				return true;
			}
			
			Vertex rpvtx = vtces.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					quee.addLast(np);
				}
			}
			
		}
		
		System.out.println("------------------------------------------------------");	
		return false;
	}
	
	/*
	 * Depth First search -  between src an ddest
	 */
	public boolean dfs(String src, String dest) {
		System.out.println("------------------------dfs------------------------");
		Map<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		stack.addFirst(sp);

		while (!stack.isEmpty()) {
			Pair rp = stack.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);
			if (containsEdge(rp.vname, dest)) {
				System.out.println(rp.psf + dest);
				return true;
			}

			Vertex rpVtx = vtces.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());

			for (String nbr : nbrs) {
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					stack.addFirst(np);
				}
			}
		}

		System.out.println("------------------------------------------------------");
		return false;

	}
	
	/*
	 * Breadth First Traversal - same as BFS just that consider all vertices from vtces map keyset
	 */
	public void bft() {
		System.out.println("--------------------------bft--------------------");
		Map<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> quee = new LinkedList<>();
		
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		
		for (String key : keys) {

			if(processed.containsKey(key)) {
				continue;
			}
			
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			quee.addLast(sp);

			while (!quee.isEmpty()) {
				Pair rp = quee.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " " + rp.psf);

				Vertex rpVtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						quee.addLast(np);
					}
				}

			}
		}
		
		System.out.println("---------------------------------------------");
		
	}
	
	/*
	 * Depth First Traversal - same as DFS just that consider all vertices from vtces map keyset
	 */
	public void dft() {
		System.out.println("--------------------------dft------------------------");
		Map<String,Boolean> processed = new HashMap<String,Boolean>();
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		LinkedList<Pair> stack = new LinkedList<>();
		for (String key : keys) {
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			stack.addFirst(sp);
			
			while(!stack.isEmpty()) {
				Pair rp = stack.removeFirst();
				
				if(processed.containsKey(rp.vname)) {
					continue;
				}
				
				processed.put(rp.vname, true);
				
				System.out.println(rp.vname+" -- "+rp.psf);
				
				Vertex rpVtx = vtces.get(rp.vname);
				ArrayList<String> nbrs =  new ArrayList<>(rpVtx.nbrs.keySet());
				
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						
						stack.addFirst(np);
					}
				}
				
				
				
			}
			
		}
		System.out.println("----------------------------------------------------");
	}
	
	/*
	 * isCyclic -- Same as BFT -- just check if the quee contains same vertex more than once at any given point
	 */
	public boolean isCyclicBFT() {
		System.out.println("----------------------------isCyclic Using BFT----------------------------");
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		LinkedList<Pair> quee = new LinkedList<>();
		Map<String,Boolean> processed = new HashMap<>();
		
		for(String key : keys) {
			
			if(processed.containsKey(key)) {
				continue;
			}
			
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			quee.addLast(sp);
			
			while(!quee.isEmpty()) {
				Pair rp = quee.removeFirst();
				
				if(processed.containsKey(rp.vname)) {
					System.out.println("Cycle exists");
					return true;
				}
				
				processed.put(rp.vname, true);
				
				System.out.println(rp.vname + " -- "+rp.psf);
				
				Vertex rpVtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						quee.add(np);
					}
				}
			}
			
		}
		System.out.println("-------------------------------------------------------------------------");
		return false;
	}
	
	/*
	 * isConnected -  Same as BFT - just check if the vertices keySet is going to run more than 1
	 */
	public boolean isConnectedBFT() {
		int flag = 0;
		LinkedList<Pair> quee = new LinkedList<>();
		Map<String, Boolean> processed = new HashMap<>();
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		
		for(String key : keys) {
			
			if(processed.containsKey(key)) {
				continue;
			}

			flag++;
			
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			quee.addLast(sp);
			
			while(!quee.isEmpty()) {
				Pair rp = quee.removeFirst();
				
				if(processed.containsKey(rp.vname)) {
					continue;
				}
				
				processed.put(rp.vname, true);
				
				Vertex rpVtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						quee.addLast(np);
					}
				}
			}
			
		}
		
		if(flag>=2) {
			return false;
		}else {
			return true;
		}
	}
	
	/*
	 * isTree - Graph is a tree if its connected and does not contain cycle
	 */
	
	public boolean isTree() {
		return !isCyclicBFT() && isConnectedBFT();
	}
	
	public ArrayList<ArrayList<String>> getConnectedComponents() {
		System.out.println("--------------------------bft--------------------");
		Map<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> quee = new LinkedList<>();
		
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		for (String key : keys) {

			if(processed.containsKey(key)) {
				continue;
			}
			
			ArrayList<String> subAns = new ArrayList<String>();
			
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			quee.addLast(sp);

			while (!quee.isEmpty()) {
				Pair rp = quee.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);
				subAns.add(rp.vname);

				System.out.println(rp.vname + " " + rp.psf);

				Vertex rpVtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpVtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						quee.addLast(np);
					}
				}

			}
			ans.add(subAns);
		}
		
		System.out.println("---------------------------------------------");
		return ans;
	}
	
}
