package Array;
/*
两个数组的交集 II
        给定两个数组，编写一个函数来计算它们的交集。

         

        示例 1：

        输入：nums1 = [1,2,2,1], nums2 = [2,2]
        输出：[2,2]
        示例 2:

        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出：[4,9]
         

        说明：

        输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
        我们可以不考虑输出结果的顺序。
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a08 {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<Integer>();
        int i=0,j=0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res=new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }


}
