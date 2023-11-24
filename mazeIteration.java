/**
 * The mazeIteration class calculates the number of ways to reach the bottom-right corner of a maze
 * given the number of rows and columns.
 */
public class mazeIteration {
    public static void main(String[] args) {
        System.out.println(nunberOfWays(2,2));
    }
   /**
    * The function calculates the number of ways to reach a cell in a grid of size r x c, starting from
    * the top-left corner and moving only right or down.
    * 
    * @param r The number of rows in the grid.
    * @param c The number of columns in the grid.
    * @return The method is returning the number of ways to reach a specific cell in a grid of size r x
    * c.
    */
    public static int nunberOfWays(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        else{
            return nunberOfWays(r-1, c) + nunberOfWays(r, c-1);
        }
    }
}
