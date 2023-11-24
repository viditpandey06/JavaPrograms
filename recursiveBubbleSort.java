/**
 * The recursiveBubbleSort class implements the bubble sort algorithm recursively to sort an array of
 * integers in ascending order.
 */

public class recursiveBubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,5,4,-7,7,7,5};
       bubbleSort(arr,arr.length);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
    /**
     * The bubbleSort function implements the bubble sort algorithm to sort an array of integers in
     * ascending order.
     * 
     * @param arr The array to be sorted.
     * @param n The parameter `n` represents the number of elements in the array `arr`.
     */
    public static void bubbleSort(int [] arr, int n){
        if (n == 1)
            return;

        int count = 0;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n - 1);
    }
}
