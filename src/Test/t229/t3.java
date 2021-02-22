package Test.t229;

public class t3 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={3,2,1};
        System.out.println(maximumScore(a,b));
    }

    public static int maximumScore(int[] nums, int[] multipliers) {
        int ans=0;
        int len=multipliers.length-1;
        int left=0;
        int right=nums.length-1;
        for (int i = 0; i <=len ; i++) {
            int leftn=left;
            int rightn=right;
            int lmax=0;
            int rmax=0;
            for (int j = i; j <=len ; j++) {
                lmax+=nums[leftn++]*multipliers[j];
            }
            for (int j = i; j <=len ; j++) {
                rmax+=nums[rightn--]*multipliers[j];
            }
            if(lmax>rmax){
                ans+=nums[left++]*multipliers[i];
            }else {
                ans+=nums[right--]*multipliers[i];
            }
        }
        return ans;
    }
}
