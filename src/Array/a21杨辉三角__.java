package Array;
/*杨辉三角 II
        给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。



        在杨辉三角中，每个数是它左上方和右上方的数的和。

        示例:

        输入: 3
        输出: [1,3,3,1]
        进阶：

        你可以优化你的算法到 O(k) 空间复杂度吗？*/


import java.util.ArrayList;
import java.util.List;

public class a21杨辉三角__ {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if (rowIndex==0){
            List<Integer> a=new ArrayList<Integer>();
            a.add(1);
            return a;
        }

        if(rowIndex==1){
            List<Integer> a=new ArrayList<Integer>();
            a.add(1);
            a.add(1);
            return a;
        }
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        List<Integer> b=new ArrayList<Integer>();
        b.add(1);
        b.add(1);
        ans.add(a);
        ans.add(b);
        int i=3;
        while (i<=rowIndex+1){
            List<Integer> x=new ArrayList<Integer>();
            x.add(1);
            int j=2;
            while (j<i){
                x.add(ans.get(i-1-1).get(j-1)+ans.get(i-1-1).get(j-1-1));
                j++;
            }
            x.add(1);
            ans.add(x);
            i++;
        }
        return ans.get(rowIndex);
    }

}
