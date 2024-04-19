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
        while (i < arr.length-2 && j < arr.length-1) {
            if (arr[j+1] - arr[j] == 1  ) {
                
                j++;
                max = Math.max(max, (j - i-ctr) + 1);
            } 
            else if (arr[j+1] - arr[j] == 0){
                ctr++;
                j++;

            } 
            else {
                max = Math.max(max, (j-i-ctr)+1);
                i=j+1;
                ctr=0;
                j=j+1;
            }

        }
        return max;
        // Arrays.sort(arr);
        // int ctr = 0;
        // int maxLength = 0;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i + 1] - arr[i] == 1) {
        //         ctr++;
        //     } else if (arr[i + 1] - arr[i] == 0) {
        //         continue;
        //     } else {
        //         maxLength = Math.max(ctr, maxLength);
        //         ctr = 0;
        //     }
        // }
        // return maxLength;
    }
}
