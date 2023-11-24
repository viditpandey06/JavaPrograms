
import java.util.*;

public class geek_o_nacci {
    public static void main(String[] args) {
       List<Integer> aList1=new ArrayList<>();
    aList1.add(1);
    aList1.add(3);
    aList1.add(2);
    series(aList1,10);
        System.out.println(aList1);
    }
    public static void series(List<Integer>aList1,int n){
    if(n==1||n==2||n==3){
        return ;
    }
    else{
        aList1.add((aList1.get(aList1.size()-1))+(aList1.get(aList1.size()-2))+(aList1.get(aList1.size()-3)));
       series(aList1,n-1);
    }
 }
}
