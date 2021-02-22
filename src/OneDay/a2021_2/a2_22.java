package OneDay.a2021_2;
/*766
给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。

        如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。

         

        示例 1：


        输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
        输出：true
        解释：
        在上述矩阵中, 其对角线为:
        "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
        各条对角线上的所有元素均相同, 因此答案是 True 。
        示例 2：


        输入：matrix = [[1,2],[2,2]]
        输出：false
        解释：
        对角线 "[1, 2]" 上的元素不同。
         

        提示：

        m == matrix.length
        n == matrix[i].length
        1 <= m, n <= 20
        0 <= matrix[i][j] <= 99*/


public class a2_22 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if( matrix.length==1||matrix[0].length==1 )return true;
        int m=matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i <m ; i++) {
            int x=i,y=0;
            while (x<m&&y<n){
                if(matrix[x++][y++]!=matrix[i][0])return false;
            }
        }
        for (int i = 0; i <n ; i++) {
            int x=0,y=i;
            while (x<m&&y<n){
                if(matrix[x++][y++]!=matrix[0][i])return false;
            }
        }
        return true;
    }
}







