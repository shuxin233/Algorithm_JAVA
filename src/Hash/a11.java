package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SplittableRandom;

public class a11 {
    public static void main(String[] args) {
        String a="a";
        String b="hfkafnabfajfaiasdkasjdbfjkbasjkdfbkjsdhkfjhskdjbaabddjariwnfv";
        System.out.println(numJewelsInStones(a,b));


    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map=new HashMap<>();
        char[] a=stones.toCharArray();
        for (int i = 0; i <stones.length() ; i++) {
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i],1);
            }
        }
        char[] b=jewels.toCharArray();
        int ans=0;
        for (int i = 0; i <jewels.length() ; i++) {
            if(map.containsKey(b[i])){
                ans+=map.get(b[i]);
            }
        }
        return ans;
    }
}
