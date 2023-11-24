public class rotaedBinarySearch {
    public static void main(String[] args) {
        //int arr[]=new int[7];
        int []arr = {0,1,2,3,4,5};
        // if(arr[0]<arr[arr.length-1]){
        //     System.out.println("Ascending Order");
        //     System.err.println("sorted");
        // }
        // else if(arr[0]>arr[arr.length-1]){
        //     System.out.println("Descending Order");
        //     System.err.println("sorted");
        // }
        // else{
        int s=0 ,e=arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            
            if(arr[s]>arr[m]){
                e=m;
            }
            else if(arr[e]<arr[m]){
                s=m;
            }
        }
        System.out.println("Progran ended");
    }
}
