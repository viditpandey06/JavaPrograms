import java.util.Arrays;

class Sort0s1s2s {
    public static void main(String [] args){
       int [] a = {0,2,1,1,0,1};
        sort012(a,6);
    }
    public static void sort012(int a[], int n) {
        // code here
        int pos0 = 0, pos1 = 0, pos2 = 0, indx = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                pos0++;
            } else if (a[i] == 1) {
                pos1++;
            } else {
                pos2++;
            }
        }
        // System.out.println(pos0 +""+pos1+""+pos2);
        while (pos0 != 0) {
            a[indx] = 0;
            indx++;
            pos0--;
        }
        while (pos1 != 0) {
            a[indx] = 1;
            indx++;
            pos1--;
        }
        while (pos2 != 0) {
            a[indx] = 2;
            indx++;
            pos2--;
        }
        System.out.println(Arrays.toString(a));
    }
}
