public class MinimumandMaximum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, -8, 46 };
        int min = findmin(arr, Integer.MAX_VALUE, 0);
        int max = findmax(arr, Integer.MIN_VALUE, 0);
        System.out.println(min);
        System.out.println(max);
    }

    public static int findmin(int[] arr, int n, int indx) {
        if (indx == arr.length) {
            return n;
        } else {
            if (arr[indx] < n) {
                n = arr[indx];
            }
            return findmin(arr, n, indx + 1);
        }
    }

    public static int findmax(int[] arr, int n, int indx) {
        if (indx == arr.length) {
            return n;
        } else {
            if (arr[indx] > n) {
                n = arr[indx];
            }
            return findmax(arr, n, indx + 1);
        }
    }

}
