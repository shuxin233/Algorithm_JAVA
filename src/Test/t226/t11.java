package Test.t226;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class t11 {
    public static void main(String[] args) {
        int a=123;
        System.out.println(1/10);
        System.out.println(countBalls(1,10));
    }


    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = lowLimit; i <=highLimit ; i++) {
            int temp=0,k=i;
            while (k!=0){
                temp+=k%10;
                k=k/10;
            }
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else {
                map.put(temp,1);
            }
        }
        int ans=0;
        for (Integer temp:map.keySet()) {
            ans=Math.max(ans,map.get(temp));
        }
        return ans;
    }
}
