package Array;

public class a05 {



    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int temp=nums[nums.length-1];
            int j=nums.length;
            while (j>0){
                nums[j]=nums[j-1];
                j--;
            }
            nums[0]=temp;
        }
    }
}
