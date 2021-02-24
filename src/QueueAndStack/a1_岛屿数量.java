package QueueAndStack;
/*岛屿数量
        给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。

        岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。

        此外，你可以假设该网格的四条边均被水包围。

         

        示例 1：

        输入：grid = [
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"]
        ]
        输出：1
        示例 2：

        输入：grid = [
        ["1","1","0","0","0"],
        ["1","1","0","0","0"],
        ["0","0","1","0","0"],
        ["0","0","0","1","1"]
        ]
        输出：3
         

        提示：

        m == grid.length
        n == grid[i].length
        1 <= m, n <= 300
        grid[i][j] 的值为 '0' 或 '1'*/

public class a1_岛屿数量 {

    public static void main(String[] args) {
        char[][] a={{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        System.out.println(numIslands(a));
    }

    public static int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [] parent=new int[m*n];
        for (int i = 0; i <parent.length; i++) {
            parent[i]=i;
        }
        for (int i = 1; i <n ; i++) {
            if(grid[0][i]=='1'&&grid[0][i-1]=='1'){
                union(parent,i,i-1);
            }
        }
        for (int i = 1; i <m ; i++) {
            if(grid[i][0]=='1'&&grid[i-1][0]=='1'){
                union(parent,i*n,(i-1)*n);
            }
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                if(grid[i][j]=='1'&&grid[i-1][j]=='1'){
                    union(parent,i*n+j,(i-1)*n+j);
                }
                if(grid[i][j]=='1'&&grid[i][j-1]=='1'){
                    union(parent,i*n+j,i*n+j-1);
                }
            }
        }
        int ans=0;
        for (int i = 0; i <parent.length; i++) {
           if(parent[i]==i)ans++;
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]=='0')ans--;
            }
        }
        return ans;
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
