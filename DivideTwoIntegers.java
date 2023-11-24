public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        int a=100,b=2;
         int ans=1,ctr=0;
         while(a-b>=0){
            System.out.println(a-b);
            System.out.println(b);
            ctr++;
            b<<=1;
           //System.out.println(ctr);
         }
    }
}
