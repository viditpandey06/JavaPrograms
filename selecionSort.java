import java.util.Arrays;

public class selecionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 ,5,-5,3,1};
        selectSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr, int indx) {
        if (arr.length - 1 == indx) {
            return;
        } else {
            int min = indx;
            for (int i = indx + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            if (min != indx) {
                int temp = arr[indx];
                arr[indx] = arr[min];
                arr[min] = temp;
            }

        }
        selectSort(arr, indx + 1);
    }
}
