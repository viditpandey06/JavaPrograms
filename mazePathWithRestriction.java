/**
 * The mazePathWithRestriction class finds all possible paths from the top-left
 * corner to the
 * bottom-right corner of a maze, with restrictions on which cells can be
 * visited.
 */
public class mazePathWithRestriction {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true },
                { true, false, true },
                { true, true, true } };
        pathRestrictions("", maze, 0, 0);
    }

    /**
     * The function "pathRestrictions" recursively finds all possible paths in a
     * maze from the top-left
     * corner to the bottom-right corner, given certain restrictions.
     * 
     * @param p    The parameter "p" is a string that represents the current path
     *             taken in the maze. It is
     *             initially an empty string and is updated recursively as the
     *             function explores different paths in
     *             the maze.
     * @param maze The maze is a 2D boolean array representing the maze. Each
     *             element in the array
     *             represents a cell in the maze. If the value is true, it means the
     *             cell is accessible, and if it is
     *             false, it means the cell is blocked.
     * @param r    The parameter "r" represents the current row position in the
     *             maze.
     * @param c    The parameter "c" represents the column index of the current
     *             position in the maze.
     */
    public static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
