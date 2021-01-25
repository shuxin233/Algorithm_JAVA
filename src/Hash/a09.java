package Hash;
/*存在重复元素 II
        给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。

         

        示例 1:

        输入: nums = [1,2,3,1], k = 3
        输出: true
        示例 2:

        输入: nums = [1,0,1,1], k = 1
        输出: true
        示例 3:

        输入: nums = [1,2,3,1,2,3], k = 2
        输出: false*/

import java.util.HashSet;

public class a09 {
    public static void main(String[] args) {
        int[] a={1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(a,2));
    }


//n*k暴力超时
  /*  public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int j = 0; j <nums.length ; j++) {
            if(j<k){
                int i=0;
                while (i<=j+k&&i<nums.length){
                    if(i==j){
                        i++;
                        continue;
                    }
                    if(nums[j]==nums[i])return true;
                    i++;
                }
            }else if (j>=nums.length-k){
                int i=nums.length-1;
                while (i>=j-k&&i>=0){
                    if(i==j){
                        i--;
                        continue;
                    }
                    if(nums[j]==nums[i])return true;
                    i--;
                }
            }else {
                int i=j-k;
                while (i<=j+k&&i<nums.length){
                    if(i==j){
                        i++;
                        continue;
                    }
                    if(nums[j]==nums[i])return true;
                    i++;
                }
            }
        }
        return false;
    }*/

//哈希表
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

}
