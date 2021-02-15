package OneDay.a2021_2;

public class a2_15 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int temp=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==1){
                temp++;
            }else {
                temp=0;
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}
