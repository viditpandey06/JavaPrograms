import java.util.*;

public class quickSort2 {
    public static void main(String[] args) {
        int [] arr = { 2, 3, 13, 53, 45, 46 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int [] arr, int low , int high){
          if(low<high){
            int  pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
          }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = -1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    public static void swap(int[] arr, int temp1, int temp2) {
        int temp = arr[temp1];
        arr[temp1] = arr[temp2];
        arr[temp2] = temp;
    }
}
