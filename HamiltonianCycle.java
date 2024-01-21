import java.util.Arrays;

public class HamiltonianCycle {

    private int V; // Number of vertices
    private int[] path; // Array to store the Hamiltonian cycle
    private int[][] graph; // Adjacency matrix

    public HamiltonianCycle(int v) {
        this.V = v;
        this.path = new int[V];
        Arrays.fill(path, -1);
        this.graph = new int[V][V];
    }

    // Check if the vertex can be added to the Hamiltonian cycle
    private boolean isSafe(int v, int pos) {
        if (graph[path[pos - 1]][v] == 0) {
            return false; // There is no edge between the last added vertex and the current vertex
        }

        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false; // Vertex is already included in the path
            }
        }

        return true;
    }

    // Recursive function to find Hamiltonian cycle
    private boolean hamiltonianCycleUtil(int pos) {
        if (pos == V) {
            // All vertices are included in the path, check if the last vertex is connected to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, pos)) {
                path[pos] = v;

                if (hamiltonianCycleUtil(pos + 1)) {
                    return true;
                }

                // Backtrack
                path[pos] = -1;
            }
        }

        return false;
    }

    // Main function to find Hamiltonian cycle
    public boolean findHamiltonianCycle() {
        path[0] = 0; // Start from the first vertex

        if (!hamiltonianCycleUtil(1)) {
            System.out.println("Hamiltonian Cycle does not exist");
            return false;
        }

        printHamiltonianCycle();
        return true;
    }

    // Print the Hamiltonian cycle
    private void printHamiltonianCycle() {
        System.out.println("Hamiltonian Cycle exists: ");
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println(path[0]); // Complete the cycle by adding the starting vertex at the end
    }

    public static void main(String[] args) {
        HamiltonianCycle hamiltonianCycle = new HamiltonianCycle(5);

        // Example graph represented by an adjacency matrix
        int[][] exampleGraph = {
                {0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0}
        };

        hamiltonianCycle.graph = exampleGraph;

        hamiltonianCycle.findHamiltonianCycle();
    }
}
