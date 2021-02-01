package OneDay.a2021_1;

public class a1_25 {

    public int regionsBySlashes(String[] grid) {
        int N=grid.length;
        UnionFind unionfind=new UnionFind(4*N*N);
        for (int i = 0; i < N; i++) {
            char[] a=grid[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                int index=4*(i*N+j);
                char c=a[j];
                if(c=='/'){
                    unionfind.union(index,index+3);
                    unionfind.union(index+1,index+2);
                }
                else if(c=='\\'){
                    unionfind.union(index,index+1);
                    unionfind.union(index+3,index+2);
                }else {
                    unionfind.union(index,index+3);
                    unionfind.union(index+1,index+2);
                    unionfind.union(index+1,index+3);
                }

                if(j+1<N){
                    unionfind.union(index+1,4*(i*N+j+1)+3);
                }

                if(i+1<N){
                    unionfind.union(index+2,4*((i+1)*N+j));
                }
            }
        }
        return unionfind.getCount();
    }


    private class UnionFind{
        private int count;
        private int[] parent;
        public UnionFind(int n){
            this.count=n;
            this.parent=new int[n];
            for (int i = 0; i <n ; i++) {
                this.parent[i]=i;
            }
        }

        public int find(int index){
            while (index!=parent[index]){
                parent[index]=find(parent[index]);
            }
            return parent[index];
        }

        public void union(int index1,int index2){
            if(find(index1)!=find(index2)){
                parent[find(index1)]=find(index2);
                count--;
            }
        }

        public int getCount() {
            return count;
        }
    }

}

