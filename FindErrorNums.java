
/**
 * The FindErrorNums class finds and prints two numbers in an array that are missing and duplicated,
 * respectively.
 */
import java.util.*;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10 };
        findErrorNums(arr);
    }

    public static void findErrorNums(int[] nums) {
        int[] freq = new int[nums.length + 1];
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] = freq[nums[i]] + 1;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                arr[0] = i;
            } else if (freq[i] == 0) {
                arr[1] = i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
