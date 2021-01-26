package Hash;
/*前 K 个高频元素
给定一个非空的整数数组，返回其中出现频率前 k 高的元素。

 

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]
 

提示：

你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
你可以按任意顺序返回答案。

*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class a13 {
    public static void main(String[] args) {
        int[] a={1,2};
        int[] b=topKFrequent(a,2);
        for (int temp:b
             ) {
            System.out.println(temp);
        }
        System.out.println();
    }


    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                int temp=map.get(nums[i]);
                map.put(nums[i],temp+1);
            }
        }
        int[] a=new int[map.values().size()];
        int i=0;
        for (int temp:map.values()) {
            a[i++]=temp;
        }
        Arrays.sort(a);
        int[] ans=new int[k];
        for (int j =0 ; j <k ; j++) {
            ans[j]=f(map,a[a.length-1-j]);
            map.remove(f(map,a[a.length-1-j]));
        }
        return ans;
    }


    public static int f(Map<Integer,Integer> map,Integer value){
        for (int temp:map.keySet()) {
            if(map.get(temp)==value)return temp;
        }
        return 1;
    }
}

