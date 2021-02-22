package OneDay.a2021_2;
/*1004
给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。

        返回仅包含 1 的最长（连续）子数组的长度。

         

        示例 1：

        输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
        输出：6
        解释：
        [1,1,1,0,0,1,1,1,1,1,1]
        粗体数字从 0 翻转到 1，最长的子数组长度为 6。
        示例 2：

        输入：A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
        输出：10
        解释：
        [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
        粗体数字从 0 翻转到 1，最长的子数组长度为 10。
         

        提示：

        1 <= A.length <= 20000
        0 <= K <= A.length
        A[i] 为 0 或 1 
*/


public class a2_19滑动窗口 {
    public static void main(String[] args) {
        int[] a={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(a,3));
    }
    public static int longestOnes(int[] A, int K) {
        int i=0;
        int j=0;
        int ans=0;
        int zero=0;
        while (j<A.length){
            if(A[j]==0)zero++;
            while (zero>K){
                if(A[i++]==0)zero--;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
