import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println("Enter numbers to check hammig distance");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        hammingDistance(x, y);
    }

    public static void hammingDistance(int x, int y) {
        int ctr = 0;
        while (x > 0 || y > 0) {
            if ((x & 1) != (y & 1)) {
                // System.out.println(x+" "+y);
                ctr += 1;
            }
            x = x >> 1;
            y = y >> 1;
            // System.out.println(x+" "+y);
        }
        System.out.println(ctr);
    }
}
