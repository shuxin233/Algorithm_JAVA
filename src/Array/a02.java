package Array;

import java.util.ArrayList;
import java.util.List;

public class a02 {
    public static void main(String[] args) {
        int[] nums =new int[]{0,1,2,4,5,7};
        List<String> ans=summaryRanges(nums);
        for (String temp:
                ans) {
            System.out.println(temp);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<String>();
        int n=nums.length;
        int i=0;
        while (i<n){
            int l=i;
            i++;
            while(i<n&&nums[i]==nums[i-1]+1){
                i++;
            }
            int r=i-1;
            String temp=Integer.toString(nums[l]);
            if(l<r){
                temp=temp+"->"+Integer.toString(nums[r]);
            }
            ans.add(temp);
        }
        return ans;
    }
}
