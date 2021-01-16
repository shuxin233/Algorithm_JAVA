package Array;
/*给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

        在杨辉三角中，每个数是它左上方和右上方的数的和。
        示例:
        输入: 5
        输出:
        [
        [1],
        [1,1],
        [1,2,1],
        [1,3,3,1],
        [1,4,6,4,1]
        ]*/


import java.util.ArrayList;
import java.util.List;

public class a21杨辉三角_ {
    public static void main(String[] args) {

        System.out.println(generate(1));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if (numRows==0)return ans;
        if(numRows==1){
            List<Integer> a=new ArrayList<Integer>();
            a.add(1);
            ans.add(a);
            return ans;
        }
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        List<Integer> b=new ArrayList<Integer>();
        b.add(1);
        b.add(1);
        ans.add(a);
        ans.add(b);
        int i=3;
        while (i<=numRows){
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
        return ans;
    }
}
