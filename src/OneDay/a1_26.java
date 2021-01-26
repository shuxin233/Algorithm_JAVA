package OneDay;
/*给你一个由一些多米诺骨牌组成的列表 dominoes。

        如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。

        形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。

        在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。

         

        示例：

        输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
        输出：1
         

        提示：

        1 <= dominoes.length <= 40000
        1 <= dominoes[i][j] <= 9*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class a1_26 {



    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <dominoes.length ; i++) {
            int index1=dominoes[i][0]*10+dominoes[i][1];
            int index2=dominoes[i][1]*10+dominoes[i][0];
            if(map.containsKey(index1)){
                map.put(index1,map.get(index1)+1);
            }else if(map.containsKey(index2)){
                map.put(index2,map.get(index2)+1);
            }
            else {
                map.put(index1,1);
            }
        }
        int ans=0;
        for (int temp:map.keySet()) {
            if(map.get(temp)!=1){
                int a=1;
                for (int i = map.get(temp)-1; i <=map.get(temp) ; i++) {
                    a*=i;
                }
                ans+=a/2;
            }
        }
        return ans;
    }

}
