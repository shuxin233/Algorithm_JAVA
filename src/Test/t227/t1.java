package Test.t227;

public class t1 {
    public static void main(String[] args) {
        int[] a={3,7,10,6,7,7};
        System.out.println(check(a));
    }

    public static boolean check(int[] nums) {
        if (nums.length==1)return true;
        boolean flag=false;
        int a=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]==a)continue;
            else flag=true;
        }
        if (!flag)return true;
        int b=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]-nums[i-1]>=0)continue;
            else {
                b++;
            }
        }
        if(b>1)return false;
        else if(b==1&nums[0]<nums[nums.length-1])return false;
        else return true;
    }
}
