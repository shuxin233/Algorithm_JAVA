package Array;
/*
合并两个有序数组
        给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

        初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。

         

        示例 1：

        输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        输出：[1,2,2,3,5,6]
        示例 2：

        输入：nums1 = [1], m = 1, nums2 = [], n = 0
        输出：[1]
         

        提示：

        nums1.length == m + n
        nums2.length == n
        0 <= m, n <= 200
        1 <= m + n <= 200
        -109 <= nums1[i], nums2[i] <= 109
*/


public class a23_合并两个有序数组 {
    public static void main(String[] args) {
        int[] a={0};
        int[] b={1};
        merge(a,0,b,1);
    }



    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for (int i = 0; i <n ; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }
        if(n==0){
            return;
        }
        int k=nums1.length-1;
        m--;
        n--;
        while (m>=0||n>=0){
            if(nums1[m]>nums2[n])nums1[k--]=nums1[m--];
            else nums1[k--]=nums2[n--];
            if(m<0){
                while (n>=0){
                    nums1[k--]=nums2[n--];
                }
            }
            if(n<0){
                while (m>=0){
                    nums1[k--]=nums1[m--];
                }
            }
        }
    }
}
