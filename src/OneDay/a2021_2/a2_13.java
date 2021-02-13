package OneDay.a2021_2;

/*448
给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

        找到所有在 [1, n] 范围之间没有出现在数组中的数字。

        您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

        示例:

        输入:
        [4,3,2,7,8,2,3,1]

        输出:
        [5,6]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a2_13 {

    public static void main(String[] args) {
        int[] a={4,7,5,6,8,7};
        Arrays.sort(a);
        List<Integer> ans=findDisappearedNumbers(a);
        for (int temp:ans
             ) {
            System.out.println(temp);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums.length==0||nums.length==1)return ans;
        Arrays.sort(nums);
        int i=0;
        for (int j = 1; j <nums[0] ; j++) {
            ans.add(j);
        }
        while (i<nums.length-1){
            if(nums[i+1]==nums[i]+1||nums[i+1]==nums[i]){
                i++;
            }else {
                for (int j = nums[i]+1; j <nums[i+1] ; j++) {
                    ans.add(j);
                }
                i++;
            }
        }
        for (int j = nums[nums.length-1]+1; j <=nums.length ; j++) {
            ans.add(j);
        }

        return ans;
    }
}
