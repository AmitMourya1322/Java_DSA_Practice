import java.util.*;
public class arrayIntersection {
    public static void arr(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    ans.add(a[i]);
                }
            }
        }
        System.out.print(ans);
       
    }
    public static void main(String[] args) {
        int[] a = {2,6,8,5,4,3};
        int[] b = {2,3,4,7};
        arr(a,b);

    }
}
