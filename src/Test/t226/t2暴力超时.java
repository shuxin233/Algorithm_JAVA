package Test.t226;

import java.util.Arrays;

public class t2暴力超时 {
    public static void main(String[] args) {
        int[][] a={{4,-2},{1,4},{-3,1}};
        int [] b=restoreArray(a);
        for (int temp:
             b) {
            System.out.println(temp);
        }
    }

    public static int[] restoreArray(int[][] adjacentPairs) {

        while (adjacentPairs.length!=1){
            for (int i = 0; i <adjacentPairs.length-1 ; i++) {
                for (int j = i+1; j <adjacentPairs.length ; j++) {
                    if(adjacentPairs[i][0]==adjacentPairs[j][adjacentPairs[j].length-1]||adjacentPairs[i][adjacentPairs[i].length-1]==adjacentPairs[j][0]||adjacentPairs[i][0]==adjacentPairs[j][0]||adjacentPairs[i][adjacentPairs[i].length-1]==adjacentPairs[j][adjacentPairs[j].length-1]){
                        adjacentPairs=f(adjacentPairs,i,j);
                    }
                }
            }
        }
        return adjacentPairs[0];
    }

    public static int[][] f(int[][] a,int l,int r){
        int [][] ans=new int[a.length-1][];
        int k=0;
        for (int i = 0; i <a.length ; i++) {
            if(i!=l&&i!=r){
                ans[k]=a[i];
                k++;
            }
        }

        int[] temp=new int[a[l].length+a[r].length-1];
        if(a[l][0]==a[r][a[r].length-1]){
            for (int i = 0; i <a[r].length ; i++) {
                temp[i]=a[r][i];
            }
            k=a[r].length;
            for (int i = 1; i <a[l].length ; i++) {
                temp[k]=a[l][i];
                k++;
            }
        }else if(a[l][a[l].length-1]==a[r][0]){
            for (int i = 0; i <a[l].length ; i++) {
                temp[i]=a[l][i];
            }
            k=a[l].length;
            for (int i = 1; i <a[r].length ; i++) {
                temp[k]=a[r][i];
                k++;
            }
        }else if(a[l][0]==a[r][0]){
            k=0;
            for (int i = a[l].length-1; i >=0 ; i--) {
                temp[k]=a[l][i];
                k++;
            }
            for (int i = 1; i <a[r].length ; i++){
                temp[k]=a[r][i];
                k++;
            }
        }else {
            k=0;
            for (int i = 0; i <a[r].length ; i++){
                temp[k]=a[r][i];
                k++;
            }
            for (int i = a[l].length-2; i >=0 ; i--) {
                temp[k]=a[l][i];
                k++;
            }
        }
        ans[ans.length-1]=temp;
        return ans;
    }
}
