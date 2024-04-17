import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class NextPermutation{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Boolean> vis = new ArrayList<>(Collections.nCopies(n, false));
        nextpermutation(n,arr,ans,temp,vis);
        System.out.println(ans);

    }
    public static void nextpermutation(int n, int[] arr, List<List<Integer>> ans, List<Integer> temp, List<Boolean> vis){
        if (temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        else{
            for(int i=0;i<n;i++){
                if(!vis.get(i)){
                    vis.set(i,true);
                    temp.add(arr[i]);
                    nextpermutation(n,arr,ans,temp,vis);
                    temp.remove(temp.size()-1);
                    vis.set(i,false);
                }
            }
        } 
    }
}