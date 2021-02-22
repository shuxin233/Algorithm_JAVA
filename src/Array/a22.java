package Array;

public class a22 {
    public int longestSubarray(int[] nums) {
        int left=0,right=0,ans=0,len=nums.length;
        int temp=0;
        while (right<len){
            if (nums[right++]==0)temp++;
            if(nums[right]==0)
            right++;
        }
        return ans;
    }

   /* public int longestSubarray(int[] nums) {
        int left=0,right=0,ans=0,zero=0,len=nums.length;
        while (right<len){
            if(nums[right]==0){
                zero++;
            }
            while (zero>1){
                if(nums[left++]==1)zero--;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }*/
}
