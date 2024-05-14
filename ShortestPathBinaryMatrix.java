import java.util.*;
public class ShortestPathBinaryMatrix {
    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 0 }, { 1, 1, 1 }, { 1, 1, 0 } };
        System.out.println(shortestPathBinaryMatrix(grid));
    }
   
            public static int shortestPathBinaryMatrix(int[][] grid) {
                int n = grid.length;
                if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
                    return -1;
                }
                
                int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
                
                Queue<int[]> queue = new LinkedList<>();
                queue.offer(new int[]{0, 0});
                grid[0][0] = 1; 
                
                int pathLength = 1;
                while (!queue.isEmpty()) {
                    int size = queue.size();
                    for (int i = 0; i < size; i++) {
                        int[] curr = queue.poll();
                        int row = curr[0];
                        int col = curr[1];
                        
                        if (row == n-1 && col == n-1) {
                            return pathLength; 
                        }
                        
                        for (int[] dir : directions) {
                            int newRow = row + dir[0];
                            int newCol = col + dir[1];
                            
                            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                                queue.offer(new int[]{newRow, newCol});
                                grid[newRow][newCol] = 1;
                            }
                        }
                    }
                    pathLength++;
                }
                
                return -1; // No valid path found
            
    }
}
