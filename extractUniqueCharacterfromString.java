import java.util.*;
public class extractUniq {
    public static String sol (String a){
        HashMap<Character,Boolean> map = new HashMap<>();
        String ans = "";
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,true);
                ans = ans+c;
            }
            else{
                continue;
            }
        }
        return ans;

        
    }
    public static void main(String[] args) {
        String a = "ababacd";
        System.out.print(sol(a));

    }
    
}
