
/**
 * The BinarySearchSqrt class implements a binary search algorithm to find the
 * square root of a given
 * number with a specified precision.
 */
public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40, p = 3;
        System.out.printf("%.3f", sqrt(n, p));
    }

    public static double sqrt(int n, int p) {
        double root = 0;
        int s = 0;
        int e = n;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
            root = e;
        }
        double temp = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += temp;
            }
            root -= temp;
            temp /= 10;
        }
        return root;
    }
}
