/**
 * The NewtonRaphorSqrt class calculates the square root of a given number using
 * the Newton-Raphson
 * method.
 */
public class NewtonRaphorSqrt {
    public static void main(String[] args) {
        int n = 40;
        System.out.printf("%.3f", sqrt(n));
    }

    public static double sqrt(int n) {
        double root = 0.0;
        double x = n;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;

    }
}
