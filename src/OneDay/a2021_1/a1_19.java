package OneDay.a2021_1;
/*给你一个points 数组，表示 2D 平面上的一些点，其中 points[i] = [xi, yi] 。

        连接点 [xi, yi] 和点 [xj, yj] 的费用为它们之间的 曼哈顿距离 ：|xi - xj| + |yi - yj| ，其中 |val| 表示 val 的绝对值。

        请你返回将所有点连接的最小总费用。只有任意两点之间 有且仅有 一条简单路径时，才认为所有点都已连接。

         

        示例 1：



        输入：points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
        输出：20
        解释：

        我们可以按照上图所示连接所有点得到最小总费用，总费用为 20 。
        注意到任意两个点之间只有唯一一条路径互相到达。
        示例 2：

        输入：points = [[3,12],[-2,5],[-4,1]]
        输出：18
        示例 3：

        输入：points = [[0,0],[1,1],[1,0],[-1,1]]
        输出：4
        示例 4：

        输入：points = [[-1000000,-1000000],[1000000,1000000]]
        输出：4000000
        示例 5：

        输入：points = [[0,0]]
        输出：0*/

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class a1_19 {
    public static void main(String[] args) {
        int[][] a={{0,0},{2,2},{3,10},{5,2},{7,0}};
        System.out.println(minCostConnectPoints(a));
    }
    public static int minCostConnectPoints(int[][] points) {
        if(points.length==0||points.length==1)return 0;
        int ans=0;
        int[] parent=new int[points.length];
        for (int i = 0; i <points.length ; i++) {
            parent[i]=i;
        }
        List<Edge> edges=new ArrayList<>();
        for (int i = 0; i <points.length ; i++) {
            for (int j = i+1; j <points.length ; j++) {
                int len=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                edges.add(new Edge(len,i,j));
            }
        }
        edges.sort(Comparator.comparingInt(Edge::getLen));
        int i=0;
        for (int j = 0; j <edges.size() ; j++) {
                if(find(parent,edges.get(j).getStart())!=find(parent,edges.get(j).getEnd())){
                    union(parent,edges.get(j).getStart(),edges.get(j).getEnd());
                    ans+=edges.get(j).getLen();
                    i++;
                    if(i==points.length)break;
                }else continue;
        }
        return ans;
    }
    public static int find(int[] parent,int index){
        if(index!=parent[index]){
            parent[index]=find(parent,parent[index]);
        }
        return parent[index];
    }
    public static void union(int[] parent,int index1,int index2){
        parent[find(parent,index1)]=find(parent,index2);
    }
}

class Edge{
    private int len;
    private int start;
    private int end;
    public Edge(int len, int start, int end) {
        this.len = len;
        this.start = start;
        this.end = end;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
