import java.util.*;
public class maxFreq {
    public static int maxFrequency(int[] a){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        int temp=0;
        for (int i:a){
            if(map.get(i)>temp){
                temp = map.get(i);
                max = i;
            }
           
        }
        return max;


    }
    public static void main(String[] args) {
        int[] a = {2,12,2,11,12,2,1,2,2,11,12,2,6};
        int ans = maxFrequency(a);
        System.out.print(ans);
        
    }
    
}
