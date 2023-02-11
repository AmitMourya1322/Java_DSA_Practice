import java.util.HashMap;

public class repeatMissing {
    public static void main(String[] args) {
        int[] a ={ 4, 3, 6, 2, 1, 1 };
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i:a){
            if(map.containsKey(i)){
                System.out.println("Repeated number is "+ map.get(i));
            }
            else{
                map.put(i, 1);
            }
        }

        for(int i=0;i<=a.length;i++){
            if(map.get(i)==null){
                System.out.print("missing number is "+i);
            }
        }
    }
}
