public class EuclidAlgorithm {
    public static void main(String[] args) {
        int a=10,b=12;
        System.out.println("The HCF is "+gcd(a,b));
       System.out.println("The LCM is "+lcm(a,b));
    }
    public static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
    public static int lcm(int a, int b) {
        
        return (a*b)/gcd(a,b);
    }

}
