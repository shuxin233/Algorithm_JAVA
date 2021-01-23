package Test.Test44场双周赛;

/*5645
有一个自行车手打算进行一场公路骑行，这条路线总共由 n + 1 个不同海拔的点组成。自行车手从海拔为 0 的点 0 开始骑行。

        给你一个长度为 n 的整数数组 gain ，其中 gain[i] 是点 i 和点 i + 1 的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔 。



        示例 1：

        输入：gain = [-5,1,5,0,-7]
        输出：1
        解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
        示例 2：

        输入：gain = [-4,-3,-2,-1,4,3,2]
        输出：0
        解释：海拔高度依次为 [0,-4,-7,-9,-10,-6,-3,-1] 。最高海拔为 0 。


        提示：

        n == gain.length
        1 <= n <= 100
        -100 <= gain[i] <= 100*/


import java.util.Arrays;

public class t1 {

    public static void main(String[] args) {

        int[] a={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(a));
    }

    public static int largestAltitude(int[] gain) {
        int i=0;
        int[] a=new int[gain.length+1];
        a[0]=0;
        while (i<gain.length){
            a[i+1]=a[i]+gain[i];
            i++;
        }
        Arrays.sort(a);
        return a[gain.length];

    }
}
