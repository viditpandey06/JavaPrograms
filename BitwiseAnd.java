class BitwiseAnd {
    public static void main(String[] args) {
        int m = 5, n = 7;
        if (m == n) {
            System.out.println("0");
        }
        int ctr = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            ctr++;
        }
        m = m << ctr;
        System.out.println(m);
    }

}