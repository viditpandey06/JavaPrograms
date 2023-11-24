public class QuickSelect {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 3, 4, 5 };
        quickSelect(arr, 0, 6, 1);
    }

    public static void quickSelect(int[] arr, int low, int high, int k) {
        int pvtIndx = partition(arr, low, high);
        System.out.println(pvtIndx);
        if (pvtIndx + 1 == k) {
            System.out.println(arr[pvtIndx]);
        } else if (pvtIndx + 1 < k) {
            quickSelect(arr, pvtIndx, high, k);
        } else {
            quickSelect(arr, low, pvtIndx, k);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int i = -1, pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;

        return i;
    }
}
