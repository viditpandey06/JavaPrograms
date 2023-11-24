
import java.util.Scanner;

public class NumberCompliment {
    public static void main(String[] args) {
        System.out.println("Enter number to get compliment");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        complimentBits(n);
        sc.close();
    }

    public static void complimentBits(int num) {
        int n = Integer.bitCount(6);
        int numberofbits = (int) (Math.log(num) / Math.log(2)) + 1;
        int sum = 0, val = 1;
        while (numberofbits > 1) {
            val = val * 2;
            sum = sum + val;
            numberofbits -= 1;
        }
        sum += 1;

        System.out.println((num ^ sum));
    }
}
