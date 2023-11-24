import java.util.Arrays;
import java.util.Scanner;

public class CountBits {

    public static void main(String[] args) {
        System.out.println("Enter number to check bits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countBits(n);


    }

    public static void countBits(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            int bitmask = i;
            int ctr = 0;
            // int loop=(int)(Math.log(n)/Math.log(b))+1;
            while (bitmask > 0) {
                if ((bitmask & 1) == 1) {
                    ctr++;
                }
                bitmask = bitmask >> 1;
            }
            arr[i] = ctr;
        }
        System.out.println(Arrays.toString(arr));
    }

}