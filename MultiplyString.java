public class MultiplyString {

    public static void main(String[] args) {
        int i = 0;
        String num1 = "2";
        String num2 = "3";
        System.out.println("1");
        int nums1 = binarySearch(num1);
        int nums2 = binarySearch(num2);
        System.out.println("2");
        System.out.println(Integer.toString(nums1 * nums2));
        System.out.println("3");
    }

    public static int binarySearch(String input) {
        int start = 1;
        int end = 2147483646;
        while (start <= end) {
            int mid = (start + end) / 2;
            String output = Integer.toString(mid);
            int temp = input.compareTo(output);
            // System.out.println(s1);
            if (temp == 0) {
                return mid;
            } else if (temp < 0) {
                end = mid;
                // System.out.println(end);
            } else if (temp > 0) {
                start = mid;
            }
        }
        return -1;
    }
}
