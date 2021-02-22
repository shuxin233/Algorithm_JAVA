package Test.t229;

public class t2 {
    public static void main(String[] args) {

    }

    public int[] minOperations(String boxes) {
        int len=boxes.length();
        int[] ans=new int[len];
        for (int i = 0; i < len; i++) {
            int max=0;
            for (int j = 0; j <len ; j++) {
                if(j!=i&&boxes.charAt(j)=='1'){
                    max+=Math.abs(i-j);
                }
            }
            ans[i]=max;
        }
        return ans;
    }
}
