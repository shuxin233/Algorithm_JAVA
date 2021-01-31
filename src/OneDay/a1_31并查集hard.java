package OneDay;

import java.util.Arrays;

public class a1_31并查集hard {

    public static void main(String[] args) {
        String[] a={"nmiwx","mniwx","wminx","mnixw","xnmwi"};
        System.out.println(numSimilarGroups(a));
    }

    public static int numSimilarGroups(String[] strs) {
        int len=strs.length;
        int[] parent=new int[len];
        for (int i = 0; i <len ; i++) {
            parent[i]=i;
        }
        for (int i = 0; i <len-1 ; i++) {
            char[] temp1=strs[i].toCharArray();
            for (int j = i+1; j <len ; j++) {
                if (strs[i].length()!=strs[j].length())continue;;
                char[] temp2=strs[j].toCharArray();
                int flag=0;
                for (int k = 0; k <strs[i].length() ; k++) {
                    if(temp1[k]!=temp2[k])flag++;
                }
                Arrays.sort(temp1);
                Arrays.sort(temp2);
                if(String.valueOf(temp1).equals(String.valueOf(temp2))){
                    if(flag==0||flag==2){
                        union(parent,i,j);
                    }
                }
                temp1=strs[i].toCharArray();
            }
        }
        int ans=0;
        for (int i = 0; i <len ; i++) {
            if(parent[i]==i)ans++;
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
        if(find(parent,index1)!=find(parent,index2)){
            parent[find(parent,index1)]=find(parent,index2);
        }
    }
}
