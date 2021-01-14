package Array;

/*
零矩阵
        编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。


        示例 1：

        输入：
        [
        [1,1,1],
        [1,0,1],
        [1,1,1]
        ]
        输出：
        [
        [1,0,1],
        [0,0,0],
        [1,0,1]
        ]
        示例 2：

        输入：
        [
        [0,1,2,0],
        [3,4,5,2],
        [1,3,1,5]
        ]
        输出：
        [
        [0,0,0,0],
        [0,4,5,0],
        [0,3,1,0]
        ]*/

public class a15 {
    public void setZeroes(int[][] matrix) {

        int x=matrix.length;
        int y=matrix[0].length;

        int[] xx=new int[x];
        int[] yy=new int[y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(matrix[i][j]==0){
                    xx[i]=1;
                    yy[j]=1;
                }
            }
        }

        for(int i=0;i<x;i++){
            if(xx[i]==1){
                for(int j=0;j<y;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<y;i++){
            if(yy[i]==1){
                for(int j=0;j<x;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }
}
