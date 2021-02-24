package QueueAndStack;
/*130
给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。

        找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。

        示例:

        X X X X
        X O O X
        X X O X
        X O X X
        运行你的函数后，矩阵变为：

        X X X X
        X X X X
        X X X X
        X O X X
        解释:

        被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
*/


import java.util.HashSet;

public class a7_被围绕的区域 {
    public static void main(String[] args) {
        char[][] a={{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
       solve(a);
    }



    public static void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int [] parent=new int[m*n];
        for (int i = 0; i <parent.length; i++) {
            parent[i]=i;
        }
        for (int i = 1; i <n ; i++) {
            if(board[0][i]=='O'&&board[0][i-1]=='O'){
                union(parent,i,i-1);
            }
        }
        for (int i = 1; i <m ; i++) {
            if(board[i][0]=='O'&&board[i-1][0]=='O'){
                union(parent,i*n,(i-1)*n);
            }
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                if(board[i][j]=='O'&&board[i-1][j]=='O'){
                    union(parent,i*n+j,(i-1)*n+j);
                }
                if(board[i][j]=='O'&&board[i][j-1]=='O'){
                    union(parent,i*n+j,i*n+j-1);
                }
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            if(board[0][i]=='O'){
                set.add(find(parent,i));
            }
            if(board[m-1][i]=='O'){
                set.add(find(parent,i+(m-1)*n));
            }
        }
        for (int i = 0; i <m ; i++) {
            if(board[i][0]=='O'){
                set.add(find(parent,i*n));
            }
            if(board[i][n-1]=='O'){
                set.add(find(parent,i*n+n-1));
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(board[i][j]=='O'){
                    if(!set.contains(find(parent,i*n+j))){
                        board[i][j]='X';
                    }
                }
            }
        }
    }

    public static int find(int[] parent,int index){
        if(parent[index]!=index){
            parent[index]=find(parent,parent[index]);
        }
        return parent[index];
    }
    public static void union(int[] parent,int index1,int index2){
        if(find(parent,index1)!=find(parent,index2)){
            parent[find(parent,index1)]=find(parent,index2);
        }
    }


}
