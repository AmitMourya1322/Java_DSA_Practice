/**
 * removeDuplicate
 */
import java.util.*;
public class removeDuplicate {
    public static ArrayList<Integer> remove(int[] a){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<a.length;i++){
        //     if(map.containsKey(a[i])){
        //         continue;
        //     }else{
        //         ans.add(a[i]);
        //         map.put(a[i], i+1);
        //     }
        // }
        for(int i:a){
            if(!map.containsKey(i)){
                ans.add(i);
                map.put(i, i+1);
            }
            else{continue;}
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,8,4,9,8,8,1,1,4,7};
       ArrayList<Integer> ans =  remove(a);
       System.out.print(ans);
        
    }
}
