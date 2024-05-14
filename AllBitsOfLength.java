

public class AllBitsOfLength {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        System.out.println(printAllBits(n));
    }

    public static String printAllBits(int n) {
        if (n == 0) {
            return "";

        } else {
            return "1" + printAllBits(n - 1);
        }

    }
}
