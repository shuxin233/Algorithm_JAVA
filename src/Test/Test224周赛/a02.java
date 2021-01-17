package Test.Test224周赛;

import java.util.Arrays;

public class a02 {

    public static void main(String[] args) {
        int[] a={2,3,4,6,8,12};
        System.out.println(tupleSameProduct(a));;
    }

    public static int tupleSameProduct(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int low=0;
        int high=nums.length-1;
        while (high>=3){
            int flag=nums[low]*nums[high];
            int low1=low+1;
            int hiht1=high-1;
            while (low1<hiht1){
                if(nums[low1]*nums[hiht1]==flag){
                    low1++;
                    hiht1--;
                    ans++;
                    continue;
                }
                if(nums[low1]*nums[hiht1]<flag){
                    low1++;
                    continue;
                }else {
                    hiht1--;
                }
            }
            low++;
            if(low>=high-2){
                low=0;
                high--;
            }

        }
        return ans*8;
    }
}
