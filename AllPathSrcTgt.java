import java.util.*;
public class AllPathSrcTgt {
    public static void main(String[] args) {
        int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
        System.out.println(allPathsSourceTarget(graph));
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path, result);
        return result;
    }
    private static void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfs(graph, nextNode, path, result);
            path.remove(path.size() - 1);
        }
    }
}
