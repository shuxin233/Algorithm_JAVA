package Array;

public class a01 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,1,2,3};
        int a=removeDuplicates(nums);
    }

    public static int  removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++) {
        if(nums[j]!=nums[i]){
            nums[++i]=nums[j];
        }
        }
        return ++i;
    }


}


