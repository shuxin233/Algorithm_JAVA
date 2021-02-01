package OneDay.a2021_2;

/*888
爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。

        因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）

        返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。

        如果有多个答案，你可以返回其中任何一个。保证答案存在。

         

        示例 1：

        输入：A = [1,1], B = [2,2]
        输出：[1,2]
        示例 2：

        输入：A = [1,2], B = [2,3]
        输出：[1,2]
        示例 3：

        输入：A = [2], B = [1,3]
        输出：[2,3]
        示例 4：

        输入：A = [1,2,5], B = [2,4]
        输出：[5,4]
         

        提示：

        1 <= A.length <= 10000
        1 <= B.length <= 10000
        1 <= A[i] <= 100000
        1 <= B[i] <= 100000
        保证爱丽丝与鲍勃的糖果总量不同。
        答案肯定存在。
*/


import java.util.Arrays;

public class a2_1 {
    public static void main(String[] args) {
        int[] a={1,17,14,1,16};
        int[] b={26,11};
        int[] c=fairCandySwap(a,b);
        for (int temp:c
             ) {
            System.out.println(temp);
        }
        System.out.println();
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] ans=new int[2];
        Arrays.sort(A);
        Arrays.sort(B);
        int sumA=0;
        int sumB=0;
        for (int i = 0; i <A.length ; i++) {
            sumA+=A[i];
        }
        for (int i = 0; i <B.length ; i++) {
            sumB+=B[i];
        }
        int x=(Math.max(sumA,sumB)-Math.min(sumA,sumB))/2;
        int a=0;
        int b=0;
        if(sumA>sumB){
            while (a<A.length&&b<B.length){
                while (B[b]>=A[a]&&a<A.length&&b<B.length){
                    a++;
                }
                if(A[a]-B[b]==x){
                    ans[0]=A[a];
                    ans[1]=B[b];
                    return ans;
                }else if(A[a]-B[b]<x){
                    a++;
                }
                else {
                    b++;
                }
            }
        }else {
            while (a<A.length&&b<B.length){
                while (B[b]<=A[a]&&a<A.length&&b<B.length){
                    b++;
                }
                if(B[b]-A[a]==x){
                    ans[0]=A[a];
                    ans[1]=B[b];
                    return ans;
                }else if(B[b]-A[a]<x){
                    b++;
                }else {
                    a++;
                }
            }
        }

        return ans;
    }
}
