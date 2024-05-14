import java.util.ArrayList;
import java.util.List;


class GFG {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        aList1.add(1);
        aList1.add(3);
        aList1.add(2);
        List<Integer> ans = new ArrayList<>();
        ans = series(aList1, 4);
        System.out.println(ans.get(aList1.size() - 1));
    }

    public static List<Integer> series(List<Integer> aList1, int n) {
        if (n == 1 || n == 2 || n == 3) {
            return aList1;
        } else {
            aList1.add((aList1.get(aList1.size() - 1)) + (aList1.get(aList1.size() - 2))
                    + (aList1.get(aList1.size() - 3)));
            return series(aList1, n - 1);
        }
    }
}
