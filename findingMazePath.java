/**
 * The "findingMazePath" class in Java recursively finds all possible paths in a maze from the top-left
 * corner to the bottom-right corner.
 */
public class findingMazePath {
    public static void main(String[] args) {
        String s="";
        mazeIteration(s, 3, 3);
        System.out.println(s);
    }
/**
 * The function "mazeIteration" recursively finds all possible paths in a maze starting from the
 * top-left corner to the bottom-right corner.
 * 
 * @param s The parameter "s" is a string that represents the current path taken in the maze. It is
 * initially an empty string and is updated recursively as the function explores different paths in the
 * maze.
 * @param r The number of rows in the maze.
 * @param c The parameter "c" represents the current column position in the maze.
 */

    public static void mazeIteration(String s, int r, int c) {

        if (r == 1 && c == 1) {
           System.out.println(s);
            return;
        } 
        else 
        {
            if (r > 1) {
                mazeIteration(s + "D", r-1, c );
            }
             if (c > 1) {
                mazeIteration(s + "R", r, c-1);
            } 
        }
    }
}
