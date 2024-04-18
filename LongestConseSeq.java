import java.util.Arrays;
import java.util.Scanner;

public class LongestConseSeq {
    public static void main(String[] args) {
        //System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = 0;
        int max = 0;
        int ctr=0;
        while (i < arr.length-1 && j < arr.length-1) {
            if (arr[j+1] - arr[j ] == 1 ) {
                if (arr[j+1] - arr[j] == 0) {
                    ctr++;
                }
                j++;
            } else {
                max = Math.max(max, j - (i+1) -ctr);
                i=j;
                ctr=0;
                j=j+1;
            }

        }
        return max;
    }
}
