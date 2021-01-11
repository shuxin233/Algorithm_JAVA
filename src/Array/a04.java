package Array;

public class a04 {
    public static void main(String[] args) {


    }

    public static int pivotIndex(int[] nums) {
       int SUM=0;
       int leftsum=0;
       for(int i=0;i<nums.length;i++){
           SUM+=nums[i];
       }
       for(int i=0;i<nums.length;i++){
           if(SUM==(2*leftsum+nums[i])){
               return i;
           }
           leftsum+=nums[i];
       }
       return -1;
    }


}
