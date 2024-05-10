import java.util.*;
import java.io.*;
import java.lang.*;

class Xorr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (ispar(st, st.length(), 0) == 0)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }

    public static int ispar(String st, int ctr, int i) {
        if (ctr == 0) {
            return 0;
        } else {
            char temp = st.charAt(i);
            switch (temp) {
                case '(':
                    return 1 ^ ispar(st, ctr - 1, i + 1);
                case ')':
                    return 1 ^ ispar(st, ctr - 1, i + 1);
                case '{':
                    return -1 + ispar(st, ctr - 1, i + 1);
                case '}':
                    return -1 + ispar(st, ctr - 1, i + 1);
                case '[':
                    return -1 + ispar(st, ctr - 1, i + 1);
                case ']':
                    return -1 + ispar(st, ctr - 1, i + 1);

                default:
                    break;
            }
        }
    }
}