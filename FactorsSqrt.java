import java.util.ArrayList;

/**
 * The FactorsSqrt class calculates and prints the factors of a given number
 * using the square root
 * method.
 */

public class FactorsSqrt {
    public static void main(String[] args) {
      { 
        int n=9;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    }
}
