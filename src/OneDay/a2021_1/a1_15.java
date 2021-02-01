package OneDay.a2021_1;

public class a1_15 {
    public int removeStones(int[][] stones) {
        int nodesCount=stones.length;
        int[] parent=new int[1000];
        for(int i=0;i<nodesCount;i++)parent[i]=i;
        for(int i=0;i<nodesCount;i++){
            for(int j=i+1;j<nodesCount;j++){
                if(stones[i][0]==stones[j][0]||stones[i][1]==stones[j][1]){
                    union(parent,i,j);
                }
            }
        }
        int sum=0;
        for(int i=0;i<nodesCount;i++){
            if(parent[i]==i)sum++;
        }
        return nodesCount-sum;

    }

    public static int find(int[] parent,int index){
        if(index!=parent[index]){
            parent[index]=find(parent,parent[index]);
        }
        return parent[index];
    }

    public static void union(int[] parent,int index1,int index2) {
       parent[find(parent,index1)]=find(parent,index2);
    }


}
