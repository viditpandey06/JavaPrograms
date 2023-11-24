/**
 * The binarySearch class implements a binary search algorithm to find the index of a target element in
 * a sorted array.
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12};
        int target = 3;
        int index = binarySearchfunc(nums, target, 0, nums.length);
        System.out.println(index);
    }
    /**
     * The binarySearchfunc function performs a binary search on a sorted array to find the index of a
     * target element.
     * 
     * @param nums The array of integers in which we want to search for the target value.
     * @param target The target is the value that we are searching for in the array.
     * @param s The parameter "s" represents the starting index of the array. It indicates the position
     * from where the search should begin.
     * @param e The parameter "e" represents the ending index of the subarray being searched.
     * @return The method `binarySearchfunc` returns an integer value. If the target element is found
     * in the array, it returns the index of the target element. If the target element is not found, it
     * returns -1.
     */
    public static int binarySearchfunc(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int mid = (s+e)/2;
            if (nums[mid] == target) {
                 System.out.println(nums[mid]);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchfunc(nums, target, mid+1, e);
            } else {
                return binarySearchfunc(nums, target, s, mid-1);
            }
        }
    }
}