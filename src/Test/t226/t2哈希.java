package Test.t226;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t2哈希 {
    public int[] restoreArray(int[][] adjacentPairs) {
        int len = adjacentPairs.length;
        int[] res = new int[len + 1];
        //构建邻接表
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] pair : adjacentPairs) {
            int num1 = pair[0], num2 = pair[1];
            map.computeIfAbsent(num1, k -> new ArrayList<>()).add(num2);
            map.computeIfAbsent(num2, k -> new ArrayList<>()).add(num1);
        }
        //寻找一个起点
        for(int key : map.keySet()) {
            if(map.get(key).size() == 1) {
                //数组索引0
                res[0] = key;
                break;
            }
        }
        //数组索引[1, len]
        for (int i = 1; i <= len; i++) {
            //当res[i]值由上一个位置key对应的List决定
            List<Integer> list = map.get(res[i-1]);
            for (int num : list) {
                if (map.containsKey(num)) {
                    res[i] = num;
                    break;
                }
            }
            map.remove(res[i-1]);
        }
        return res;
    }
}
