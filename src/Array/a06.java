package Array;

public class a06 {


    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        //int[] aa = kSort(0, num.length - 1, num);
        System.out.println(containsDuplicate(num));
    }

    public static boolean containsDuplicate(int[] nums) {
        nums=kSort(0,nums.length-1,nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
       return false;
    }

    public static int[] kSort(int start,int end,int[] nums){//快速排序
        if(start<end){
            int temp=nums[start];
            int i=start;
            int j=end;
            while (i<j){
                while (i<j&&nums[j]>=temp){
                    j--;
                }
                nums[i]=nums[j];
                while (i<j&&nums[i]<=temp){
                    i++;
                }
                nums[j]=nums[i];
            }
            nums[i]=temp;
            kSort(start,i-1,nums);
            kSort(i+1,end,nums);
        }else {
            return nums;
        }
        return nums;
    }


}
