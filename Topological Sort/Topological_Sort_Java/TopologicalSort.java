import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

//Time complexity : O(V + E)
//V : number of vertices of the graph
//E : number of edges of the graph
public class TopologicalSort {
    //Graph class implemented with adjacency list method
    //resource : https://www.geeksforgeeks.org/graph-and-its-representations/ 
	static class Graph {
        int N;
        ArrayList<ArrayList<Integer>> list;
        public Graph(int v) {
            N = v;
            list = new ArrayList<>(v);
            for(int i = 0; i < v; i++)
                list.add(new ArrayList<>());
        }
        public void addEdge(int v1, int v2) {
            list.get(v1).add(v2);
        }
    }
	static void dfs(Graph g, Integer i, HashMap<Integer, Boolean> visited, 
	Stack<Integer> stack) {
        visited.put(i, true);
        ArrayList<Integer> neighbors = g.list.get(i);
        for(Integer x : neighbors)
            if(!visited.get(x))
                dfs(g, x, visited, stack);
        stack.push(i);
    }
	static ArrayList<Integer> topologicalSort(Graph g) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int x = 0; x < g.N; x++)
            visited.put(x, false);
        
        for(int i = 0; i < g.N; i++) {
            if(!visited.get(i))
            	dfs(g, i, visited, stack);
        }
        
        while(!stack.empty()) {
        	int temp = stack.pop();
        	output.add(temp);
        }
        return output;
    }
    //driver method
    public static void main(String[] args) {
        //The directed acyclic graph that is created here:
        //  5 ------> 0 <-------- 4
        //  |                     |
        //  |                     |
        //  |                     |
        // \|/                   \|/
        //  *                     *
        //  2 ------> 3 --------> 1
		Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 

        ArrayList<Integer> sorted = topologicalSort(g);
        for(Integer x : sorted) {
        	System.out.print(x+" ");
        }
	}
}