public class QuickSelectII {

    public static int quickSelect(int[] array, int left, int right, int k) {
        if (left == right) {
            return array[left];
        }

        int pivotIndex = partition(array, left, right);

        if (k == pivotIndex) {
            return array[k];
        } else if (k < pivotIndex) {
            return quickSelect(array, left, pivotIndex - 1, k);
        } else {
            return quickSelect(array, pivotIndex + 1, right, k);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 1, 5, 6, 4 };
        int k = 3; // Find the kth smallest element

        int result = quickSelect(arr, 0, arr.length - 1, k - 1);

        System.out.println("The " + k + "th smallest element is: " + result);
    }
}
