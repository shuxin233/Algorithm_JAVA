package Hash;

/*
两个数组的交集
        给定两个数组，编写一个函数来计算它们的交集。

         

        示例 1：

        输入：nums1 = [1,2,2,1], nums2 = [2,2]
        输出：[2]
        示例 2：

        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出：[9,4]
         

        说明：

        输出结果中的每个元素一定是唯一的。
        我们可以不考虑输出结果的顺序。
*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class a03 {



    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while (i<nums1.length&&j<nums2.length){
            while (i<nums1.length&&j<nums2.length&&nums1[i]<nums2[j]){
                i++;
            }
            while (i<nums1.length&&j<nums2.length&&nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            while (i<nums1.length&&j<nums2.length&&nums1[i]>nums2[j]){
                j++;
            }
            while (i<nums1.length&&j<nums2.length&&nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans=new int[set.size()];
        for (int k = 0; k < ans.length ; k++) {
            ans[k]=(int)set.toArray()[k];
        }
        return ans;
    }
}
