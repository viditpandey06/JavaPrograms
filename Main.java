
// Java Program to implement above approach
// Java Program to detect cycle in a graph
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int V; // number of vertices
    private ArrayList<ArrayList<Integer>> adj; // adjacency list

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    public boolean isCyclic() {
        int[] inDegree = new int[V]; // stores in-degree of each vertex
        Queue<Integer> q = new LinkedList<>(); // queue to store vertices
                                               // with 0 in-degree
        int visited = 0; // count of visited vertices

        // calculate in-degree of each vertex
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                inDegree[v]++;
            }
        }

        // enqueue vertices with 0 in-degree
        for (int u = 0; u < V; u++) {
            if (inDegree[u] == 0) {
                q.add(u);
            }
        }

        // BFS traversal
        while (!q.isEmpty()) {
            int u = q.poll();
            visited++;

            // reduce in-degree of adjacent vertices
            for (int v : adj.get(u)) {
                inDegree[v]--;
                // if in-degree becomes 0, enqueue the
                // vertex
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        return visited != V; // if not all vertices are
                             // visited, there is a cycle
    }
}

// Driver code
public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(5, 3);

        if (g.isCyclic()) {
            System.out.println("Graph contains cycle.");
        } else {
            System.out.println(
                    "Graph does not contain cycle.");
        }
    }
}

// Driver code
public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(5, 3);

        if (g.isCyclic()) {
            System.out.println("Graph contains cycle.");
        } else {
            System.out.println("Graph does not contain cycle.");
        }
    }
}
