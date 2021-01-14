package Array;
/*对角线遍历
        给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

        示例:

        输入:
        [
        [ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]
        ]

        输出:  [1,2,4,7,5,3,6,8,9]

        说明:

        给定矩阵中的元素总数不会超过 100000 。*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class a16 {


    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return new int[]{};
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer>[] ans=new LinkedList[m+n-1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = i + j;
                if (ans[sum] == null) ans[sum] = new LinkedList<>();
                if (sum % 2 == 0) {
                    // 当x+y的和是偶数的时候，线是向上斜走的
                    // 那么，x坐标大的数是排在前面
                    ans[sum].add(0, matrix[i][j]);
                } else {
                    ans[sum].add(matrix[i][j]);
                }
            }
        }

        int[] res = new int[m * n];
        int index = 0;
        for (int k = 0; k < ans.length; k++) {
            if (ans[k] != null) {
                for (int num : ans[k]) {
                    res[index++] = num;
                }
            }
        }

        return res;
    }
}
